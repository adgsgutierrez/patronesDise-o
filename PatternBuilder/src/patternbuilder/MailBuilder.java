/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patternbuilder;

/**
 *
 * @author aricdayangutierrezsanchez
 */
public class MailBuilder extends MessageBuilder{

    @Override
    public void setMail() {
        message.setFrom("From Mail");
        message.setTo("To Mail");
        message.setSubject("Subject in Mail");
        message.setMessage("Message set in Mail");
    }

    @Override
    public void send() {
        System.out.println("<html>");
        System.out.println("<body>");
        System.out.println("<p><span><b>From:</b></span>"+message.getFrom()+"</p>");
        System.out.println("<p><span><b>To:</b></span>"+message.getTo()+"</p>");
        System.out.println("<p><span><b>Subject:</b></span>"+message.getSubject()+"</p>");
        System.out.println("<article>"+message.getMessage()+"</article>");
        System.out.println("</body>");
        System.out.println("</html>");
    }
    
}
