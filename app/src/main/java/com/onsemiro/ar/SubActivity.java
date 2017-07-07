package com.onsemiro.ar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import eu.kudan.kudan.ARAPIKey;
import eu.kudan.kudan.ARActivity;
import eu.kudan.kudan.ARImageNode;
import eu.kudan.kudan.ARImageTrackable;
import eu.kudan.kudan.ARImageTrackableListener;
import eu.kudan.kudan.ARImageTracker;

public class SubActivity extends ARActivity implements ARImageTrackableListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ARAPIKey key = ARAPIKey.getInstance();
        key.setAPIKey("rhTeqVaK0hgJkBLWkDC60l9x1uC8RNczZsvhktPttif11dL/uLxx0TtANDXsOqHk3Ng3Tp/JXI3UnPISJu4fy6acVN7eghv4Ieva2v2oiAE9ZjfnvwH5ECuPULadTKgBP6/w/04EfcrRz7C+c5FZQ2AEvDIqpp5p0vCTpQCd1fS0i9WDuZlRG8bMULfLw1+V7vYFTBNd1T40mxp7PnIEa6/L82BXK9TqoGWWuO+7N20SBwwWpvoFWL6UKt50ndhWXoHXkGyt2lPh6HSzRtuYXgTYywgTDRFOPU178cGXmhVofqYunyCQpFPSTL8iB7ZFTRKdmY/uSBiqeZdPuCYsJcknKVJAYY5Ohlt9EapDECyNUeD8FqUzAkqnpm1NfyEW3uZHPXmXSl+QnzcNZXCLxmt5UZxeUz58+g5DIKZwqZ+5jMkfKRBX6NnQFcr9d6cjJWQqxGU+N+O2LwtMyjf2zxy2RlytIcvxt3JDKve+STa6p/3PUMVW2jTDeULPEQSreH6TTdOPwd8tSqJSlFe4N1jGnoftgNQpEo3iZr7tvLuQFg9c1scFIEK1gyb8VXZJjfLBb35/wkbUzLtaQcJlSOIb/q/WcUC5DdbH6b1z2pYMS7SFt+ARjtM2c3sMXbMay7KtzYkh/kU/zqkh+5azx7A2/LyeTFJVoqDo6lw7cOU=");
        setContentView(R.layout.activity_sub);
    }
    @Override
    public void setup(){
        ARImageTrackable trackable = new ARImageTrackable("Space");
        trackable.loadFromAsset("spaceMarker.jpg");
        ARImageTracker trackableManager = ARImageTracker.getInstance();
        trackableManager.addTrackable(trackable);
        ARImageNode imageNode=new ARImageNode("eyebrow.png");
        trackable.getWorld().addChild(imageNode);
        trackable.addListener(this);
    }
    @Override
    public void didDetect(ARImageTrackable arImageTrackable) {
        Log.d("Space", "did Detect");
    }

    @Override
    public void didTrack(ARImageTrackable arImageTrackable) {
        Log.d("Space", "did Track");
    }

    @Override
    public void didLose(ARImageTrackable arImageTrackable) {
        Log.d("Space","did lose");
    }
}
