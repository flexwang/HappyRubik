/*
 * Copyright 2011-2014 Zhaotian Wang <zhaotianzju@gmail.com>
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package flex.android.magiccube.activity;

import android.app.Activity;
import android.os.Bundle;

public class BasicGameActivity extends Activity{
    protected int width;
    protected int height;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
       // WindowManager wm = (WindowManager)getSystemService(Context.WINDOW_SERVICE);
        
       // width = wm.getDefaultDisplay().getWidth();
       // height = wm.getDefaultDisplay().getHeight();
    }
}