/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;

public class ScrapManagerWorkRequest extends WorkRequest {
    private String testResult;
    private UserAccount recycleManagerName;
    private int quantity;

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public UserAccount getScrapManagerName() {
        return recycleManagerName;
    }

    public void setScrapManagerName(UserAccount recycleManagerName) {
        this.recycleManagerName = recycleManagerName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
