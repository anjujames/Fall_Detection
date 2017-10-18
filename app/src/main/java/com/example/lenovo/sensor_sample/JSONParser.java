package com.example.lenovo.sensor_sample;

import android.annotation.SuppressLint;
import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Smitha on 17-Oct-17.
 */

class JSONParser { public JSONParser()
{
    super();
}



    @SuppressLint("LongLogTag")
    public FallDetailsTable parseUserDetails(JSONObject object)
    {
        FallDetailsTable userDetail=new FallDetailsTable();

        try {
            JSONObject jsonObj=object.getJSONArray("Value").getJSONObject(0);

            FallDetails.setFallValue(jsonObj.getString("sum"));


        } catch (JSONException e) {
            // TODO Auto-generated catch block
            Log.d("JSONParser = > parseUserDetails", e.getMessage());
        }

        return userDetail;

    }

    public boolean parseUserAuth(JSONObject jsonObj) {
        return true;

    }
}

