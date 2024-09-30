      /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Validations {
    public static boolean isDigit(String input){
        
          String regex = "^[0-9]{0,2}$";
          Pattern pattern = Pattern.compile(regex);
          Matcher matcher = pattern.matcher(input);
          boolean output=matcher.matches();
          
          return output;
    }
    
    public static boolean isPhoneNumber(String input)
    {

        String regex = "^([0-9]{3})-([0-9]{3})-[0-9]{4}$";
          Pattern pattern = Pattern.compile(regex);
          Matcher matcher = pattern.matcher(input);
          boolean output=matcher.matches();
          
          return output;
    }
    
    public static boolean isValidEmailId(String input){
        
          String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9+_.-]+.[A-Za-z]$";
          Pattern pattern = Pattern.compile(regex);
          Matcher matcher = pattern.matcher(input);
          boolean output=matcher.matches();
          
          return output;
    }
    
    public static boolean isValidUsername(String input){
        boolean output = true;
        EcoSystem system = EcoSystem.getInstance();
        for (Network n : system.getNetworkList()){
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()){
                System.out.println("inside enterprise");
                System.out.println(e.getName());
//                if (e.getEnterpriseType().equals(Enterprise.EnterpriseType.CentralHub)){
                    for(UserAccount ua : e.getUserAccountDirectory().getUserAccountList()){
                        if(ua.getUsername().equals(input)){
//                            JOptionPane.showMessageDialog(null, "User Name already exists!, Please Enter valid user name","warning", JOptionPane.WARNING_MESSAGE);'
                            output=false;
                            return output;
                        }
                        for(Organization o : e.getOrganizationDirectory().getOrganizationList()){
                            System.out.println("inside org");
                            System.out.println(o.getName());
                            for(UserAccount ua1 : o.getUserAccountDirectory().getUserAccountList()){
                                System.out.println("inside ua");
                                if(ua1.getUsername().equals(input)){
                                    System.out.println("inside username");
//                                    JOptionPane.showMessageDialog(null, "User Name already exists!, Please Enter valid user name","warning", JOptionPane.WARNING_MESSAGE);
                                    output=false;
                                    System.out.println("found");
                                    return output;
                                }
                            }
                        }
                    }
//                }
            }
        }
        return output;
    }
}
