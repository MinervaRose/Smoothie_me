/* Code adapted by Sabrina Palis during the
 * Advanced Android App Development course by Udacity
 * Android_me project.
 *
 * Copyright (C) 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.myapplication.ui;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import com.example.android.myapplication.R;
import com.example.android.myapplication.data.SmoothieImageAssets;

// This activity will display a custom Smoothie Recipe Inspiration Image composed of three parts: title fruit vegetable

public class SmoothieMeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smoothie_me);

        // Only create new fragments when there is no previously saved state.

        if (savedInstanceState == null) {

            // Retrieve list index values that were sent through an intent; use them to display the desired SmoothieMe image
            // Use setListindex(int index) to set the list index for all SmoothiePartFragments

            // Create a new title SmoothiePartFragment
            SmoothiePartFragment titleFragment = new SmoothiePartFragment();

            // Set the list of image id's for the title fragment and set the position to the second image in the list
            titleFragment.setImageIds(SmoothieImageAssets.getTitles());

            // Get the correct index to access in the array of title images from the intent
            // Set the default value to 0
            int titleIndex = getIntent().getIntExtra("titleIndex", 0);
            titleFragment.setListIndex(titleIndex);

            // Add the fragment to its container using a FragmentManager and a Transaction
            FragmentManager fragmentManager = getSupportFragmentManager();

            // Fragment transaction
            fragmentManager.beginTransaction()
                    .add(R.id.title_container, titleFragment)
                    .commit();


            // Create a new fruit SmoothiePartFragment
            SmoothiePartFragment fruitFragment = new SmoothiePartFragment();
            fruitFragment.setImageIds(SmoothieImageAssets.getFruits());
            int fruitIndex = getIntent().getIntExtra("fruitIndex", 0);
            fruitFragment.setListIndex(fruitIndex);

            fragmentManager.beginTransaction()
                    .add(R.id.fruit_container, fruitFragment)
                    .commit();

            // Create a new vegetable SmoothiePartFragment
            SmoothiePartFragment vegetableFragment = new SmoothiePartFragment();
            vegetableFragment.setImageIds(SmoothieImageAssets.getVegetables());
            int vegetableIndex = getIntent().getIntExtra("vegetableIndex", 0);
            vegetableFragment.setListIndex(vegetableIndex);

            fragmentManager.beginTransaction()
                    .add(R.id.vegetable_container, vegetableFragment)
                    .commit();
        }

    }

}
