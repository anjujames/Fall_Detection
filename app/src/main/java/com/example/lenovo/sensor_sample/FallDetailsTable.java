package com.example.lenovo.sensor_sample;

/**
 * Created by Smitha on 18-Oct-17.
 */

class FallDetailsTable {

    float FallValue;

    public FallDetailsTable(float FallValue) {
        super();
        this.FallValue = FallValue;

    }

    public FallDetailsTable() {
        super();
       this.FallValue= Float.parseFloat(null);

    }

    public float getFallValue() {
        return FallValue;
    }

    public void setFallValue(float FallValue) {
        this.FallValue = FallValue;
    }

}

