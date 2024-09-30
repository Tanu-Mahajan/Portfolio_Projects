/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.Date;

public class Records {
    private Date requestDate;
    private int mobileDonated;
    private int mobileGiven;
    private int mobileDecomposed;
    
    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public int getMobileDonated() {
        return mobileDonated;
    }

    public int getMobileDecomposed() {
        return mobileDecomposed;
    }

    public void setMobileDecomposed(int mobileDecomposed) {
        this.mobileDecomposed = mobileDecomposed;
    }
    

    public void setMobileDonated(int mobileDonated) {
        this.mobileDonated = mobileDonated;
    }

    public int getMobileGiven() {
        return mobileGiven;
    }

    public void setMobileGiven(int mobileGiven) {
        this.mobileGiven = mobileGiven;
    }
    
    
}
