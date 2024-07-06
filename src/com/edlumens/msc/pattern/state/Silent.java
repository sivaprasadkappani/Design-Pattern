package com.edlumens.msc.pattern.state;

public class Silent implements MobileAlertState {
    @Override public void alert(AlertStateContext ctx)
    {
        System.out.println("Silent mode.. No ring tone..." );
    }
}