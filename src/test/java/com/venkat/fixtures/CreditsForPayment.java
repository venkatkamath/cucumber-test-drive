package com.venkat.fixtures;

import com.venkat.JukeBox;

/**
 * Created by mongo on 2/1/15.
 */
public class CreditsForPayment {

    private double payment;
    private int credits;

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public void execute() {
        System.out.println("calling execute for payment="+this.payment);
        this.credits = new JukeBox().calculateCredits(this.payment);
    }

    public int credits() {
       return this.credits;
    }
}
