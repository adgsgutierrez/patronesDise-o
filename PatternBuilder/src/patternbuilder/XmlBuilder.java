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
public class XmlBuilder extends MessageBuilder{

    @Override
    public void setMail() {
        message.setFrom("From XML");
        message.setTo("To XML");
        message.setSubject("Subject in XML");
        message.setMessage("Message set in XLM");
    }

    @Override
    public void send() {
        System.out.println("<message>");
        System.out.println("<from>"+message.getFrom()+"</from>");
        System.out.println("<to>"+message.getTo()+"</to>");
        System.out.println("<subject>"+message.getSubject()+"</subject>");
        System.out.println("<message>"+message.getMessage()+"</message>");
        System.out.println("</message>");
    }
    
}
