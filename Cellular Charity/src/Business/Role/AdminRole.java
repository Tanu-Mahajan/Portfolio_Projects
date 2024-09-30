/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.LogisticsNexusEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.Logistics;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.AdministrativeRole.AdminWorkAreaJPanel;
import userinterface.TransportManagerRole.TransportManagerWorkAreaJPanel;


public class AdminRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
//        if (enterprise instanceof LogisticsNexusEnterprise) {
//            System.out.println(organization.getName() + "Majha naav aahe");
//            return new TransportManagerWorkAreaJPanel(userProcessContainer, account, (Logistics)organization, enterprise, business);
//        } else {
            return new AdminWorkAreaJPanel(userProcessContainer, enterprise);
        }
    
    
}
