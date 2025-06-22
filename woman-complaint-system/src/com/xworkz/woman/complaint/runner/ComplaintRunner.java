package com.xworkz.woman.complaint.runner;

import com.xworkz.woman.complaint.dto.ComplaintDto;
import com.xworkz.woman.complaint.service.ComplaintService;
import com.xworkz.woman.complaint.service.ComplaintServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

@WebServlet(urlPatterns = "/police", loadOnStartup = 1)
public class ComplaintRunner extends HttpServlet {

    // ✅ Create service only once at servlet level
    private ComplaintService complaintService = new ComplaintServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String phoneNo = req.getParameter("phoneNo");
        String issue = req.getParameter("issue");
        String issueType = req.getParameter("issueType");
        String location = req.getParameter("location");

        ComplaintDto complaintDto = new ComplaintDto();
        complaintDto.setName(name);
        complaintDto.setPhoneNo(Long.parseLong(phoneNo));
        complaintDto.setIssue(issue);
        complaintDto.setIssueType(issueType);
        complaintDto.setDateTime(Timestamp.valueOf(LocalDateTime.now()));
        complaintDto.setLocation(location);

        complaintService.save(complaintDto);

        req.setAttribute("complaintDto", complaintDto);
        req.setAttribute("message", "Complaint raised successfully!");

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("complaintSuccess.jsp");
        requestDispatcher.forward(req, resp);
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("Running in doGet");

        List<ComplaintDto> complList = complaintService.view();
        System.out.println(complList);

        req.setAttribute("complList", complList);  // ✅ Use complList for consistency
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("viewComplaint.jsp");
        requestDispatcher.forward(req, resp);
    }

}
