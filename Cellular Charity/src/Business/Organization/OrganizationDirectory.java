/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

public class OrganizationDirectory {
    private ArrayList<Organization> organizationList;
    
    public OrganizationDirectory(){
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public void setOrganizationList(ArrayList<Organization> organizationList) {
        this.organizationList = organizationList;
    }
    public Organization createOrganization(Organization.Type type){
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.Donor.getValue())){
            organization = new DonorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.QualityAssuranceCenter.getValue())){
            organization = new QualityAssuranceCenter();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Technician.getValue())){
            organization = new Technician();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.RetailChain.getValue())){
              organization = new RetailChain();
              organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.HeadOffice.getValue())){
            organization = new HeadOffice();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Inventory.getValue())){
            organization = new Inventory();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.ScrapPoint.getValue())){
            organization = new ScrapPoint();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Logistics.getValue())){
            organization = new Logistics();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Driver.getValue())){
            organization = new Driver();
            organizationList.add(organization);
        }
        return organization;
    }
    
    
}
