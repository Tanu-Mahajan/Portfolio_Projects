/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.OfficeManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

public class HeadOffice extends Organization{
    
    public HeadOffice(){
        super(Organization.Type.HeadOffice.getValue());
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new OfficeManagerRole());
        return roles;
    }
    
}
