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
public class PatternBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SendMail mail = new SendMail();
         
        JsonBuilder json = new JsonBuilder();
        MailBuilder email = new MailBuilder();
        XmlBuilder xml = new XmlBuilder();
        
        mail.setMessage(email);
        mail.loadMail();
        mail.getMessage().send();
    }
    
}
