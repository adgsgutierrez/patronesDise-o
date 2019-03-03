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
public class JsonBuilder extends MessageBuilder{

    @Override
    public void setMail() {
        message.setFrom("From Json");
        message.setTo("To Json");
        message.setSubject("Subject in Json");
        message.setMessage("Message set in Json");
    }

    @Override
    public void send() {
        System.out.println("{");
        System.out.println("'from':'"+message.getFrom()+"',");
        System.out.println("'to':'"+message.getTo()+"',");
        System.out.println("'subject':'"+message.getSubject()+"',");
        System.out.println("'message':'"+message.getMessage()+"'");
        System.out.println("}");
    }
    
}
