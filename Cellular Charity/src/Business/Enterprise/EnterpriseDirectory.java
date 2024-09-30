/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;


public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
    
    public EnterpriseDirectory(){
        enterpriseList = new ArrayList();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    public void createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        if(type== Enterprise.EnterpriseType.CentralHub){
            enterprise=new CentralHubEnterprise(name);
            enterpriseList.add(enterprise);
        }
        if(type== Enterprise.EnterpriseType.InspectionHub){
            enterprise=new InspectionHubEnterprise(name);
            enterpriseList.add(enterprise);
        }
        if(type== Enterprise.EnterpriseType.ScrapHub){
            enterprise=new ScrapHubEnterprise(name);
            enterpriseList.add(enterprise);
        }
        if(type== Enterprise.EnterpriseType.LogisticsNexus){
            enterprise=new LogisticsNexusEnterprise(name);
            enterpriseList.add(enterprise);
        }
       // return enterprise;
    }
    
}
