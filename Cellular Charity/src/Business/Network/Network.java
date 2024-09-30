/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.ScrapHubEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Enterprise.CentralHubEnterprise;
import Business.Organization.ScrapPoint;
import Business.Organization.Inventory;
import Business.Organization.Organization;
import Business.Organization.RetailChain;
import java.util.HashMap;

public class Network {
    private String name;
    private EnterpriseDirectory enterpriseDirectory;
    
    public Network(){
        enterpriseDirectory=new EnterpriseDirectory();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }
    public String toString(){
        return name;
    }   
    
    public int donationByNetwork(int month){
        int donation=0;
        for(Enterprise enterprise:enterpriseDirectory.getEnterpriseList()){
           if(enterprise instanceof CentralHubEnterprise){
             for(Organization org: enterprise.getOrganizationDirectory().getOrganizationList()){
                 if(org instanceof Inventory){
                   donation+=((Inventory) org).totalMobileDonated(month);
                 }
                 if(org instanceof RetailChain){
                   donation+=((RetailChain) org).donationAcrossStores(month);
                 }
             }
           }
        }
        return donation;
    }
     
    public int donationByNetwork(){
        int donation=0;
        for(Enterprise enterprise:enterpriseDirectory.getEnterpriseList()){
           if(enterprise instanceof CentralHubEnterprise){
             for(Organization org: enterprise.getOrganizationDirectory().getOrganizationList()){
                 if(org instanceof Inventory){
                   donation+=((Inventory) org).totalMobileDonated();
                 }
                 if(org instanceof RetailChain){
                   donation+=((RetailChain) org).donationAcrossStores();
                 }
             }
           }
        }
        return donation;
    }
    
    public int decompositionByNetwork(){
        int decomposition=0;
        for(Enterprise enterprise:enterpriseDirectory.getEnterpriseList()){
           if(enterprise instanceof ScrapHubEnterprise){
             for(Organization org: enterprise.getOrganizationDirectory().getOrganizationList()){
                 decomposition+=((ScrapPoint)org).totalMobileDecomposed();
             }
           }
        }
        return decomposition;
    }
    
    public int giveAwayByNetwork(int month){
        int donation=0;
        for(Enterprise enterprise:enterpriseDirectory.getEnterpriseList()){
           if(enterprise instanceof CentralHubEnterprise){
             for(Organization org: enterprise.getOrganizationDirectory().getOrganizationList()){
                 if(org instanceof Inventory){
                   donation+=((Inventory) org).totalMobileGivenAway(month);
                 }
                 if(org instanceof RetailChain){
                   donation+=((RetailChain) org).giveAwayAcrossStores(month);
                 }
             }
           }
        }
        return donation;
    }
     
    public HashMap<String, Integer> giveAwayByNetwork(){
        HashMap<String, Integer> hmap=null;
        for(Enterprise enterprise:enterpriseDirectory.getEnterpriseList()){
           if(enterprise instanceof CentralHubEnterprise){
             for(Organization org: enterprise.getOrganizationDirectory().getOrganizationList()){
                
                 if(org instanceof RetailChain){
                   hmap=((RetailChain) org).giveAwayAcrossStores();
                 }
             }
           }
        }
        return hmap;
    }
}
