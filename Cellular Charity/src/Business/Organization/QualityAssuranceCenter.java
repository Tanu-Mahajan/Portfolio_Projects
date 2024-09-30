/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.TechnicianRole;
import Business.Role.QualityCenterManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

public class QualityAssuranceCenter extends Organization {

    public QualityAssuranceCenter() {
        super(Organization.Type.QualityAssuranceCenter.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new QualityCenterManagerRole());
        return roles;
    }
    
}
