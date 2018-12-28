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
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.android.myapplication.R;
import com.example.android.myapplication.data.SmoothieImageAssets;

import java.util.ArrayList;
import java.util.List;

public class SmoothiePartFragment extends Fragment {
    // Final Strings to store state information about the list of images and list index
    public static final String IMAGE_ID_LIST = "image_ids";
    public static final String LIST_INDEX = "list_index";

    // Tag for logging
    private static final String TAG = "SmoothiePartFragment";

    // Variables to store a list of image IDs resources and the index of the image that this fragment displays
    private List<Integer> mImageIds;
    private int mListIndex;

    // mandatory empty constructor that is necessary for instantiating the fragment
    public SmoothiePartFragment() {
    }

    /**
     * Inflates the fragment layout and sets any image resources
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // If I detect a saved sate, I'll Load the saved state (the list of images and list index)
        if (savedInstanceState != null) {
            mImageIds = savedInstanceState.getIntegerArrayList(IMAGE_ID_LIST);
            mListIndex = savedInstanceState.getInt(LIST_INDEX);
        }

        // Inflate the Smoothie_ingredient fragment layout
        View rootView = inflater.inflate(R.layout.fragment_smoothie_part, container, false);

        // Get a reference to the ImageView in the fragment layout
        // The imageView needs to be declared final since it's being accessed now by an inner class.
        final ImageView imageView = (ImageView) rootView.findViewById(R.id.smoothie_part_image_view);

        // If a list of image ids exists, set the image resource to the correct item in that list
        // Otherwise, create a Log statement that indicates that the list was not found
        if (mImageIds != null) {
            // Set the image resource to the list item at the stored index
            imageView.setImageResource(mImageIds.get(mListIndex));

            // Set a click listener on the image view. We handle the click within the fragment class since it repeats for
            // all body part fragments.
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // Increment position as long as the index remains <= the size of the image ids list
                    if (mListIndex < mImageIds.size() - 1) {
                        mListIndex++;
                    } else {
                        // The end of list has been reached, so return to beginning index
                        mListIndex = 0;
                    }
                    // Set the image resource to the new list item
                    imageView.setImageResource(mImageIds.get(mListIndex));
                }
            });

        } else {
            Log.v(TAG, "null list of image ids");
        }

        // Return the rootView
        return rootView;
    }

    // Setter methods for keeping track of the list images this fragment can display and which image
    // in the list is currently being displayed

    public void setImageIds(List<Integer> imageIds) {
        mImageIds = imageIds;
    }

    public void setListIndex(int index) {
        mListIndex = index;
    }

    /**
     * Save the current state of this fragment otherwise when I rotate the device it loses the state.
     * I can do this by overriding the method, onSaveInstanceState, and saving the current
     * variables in a bundle.
     * A bundle in this case is just a set of key value pairs.
     * I want to have this bundle include the image list and the current list index of this body
     * part fragment.
     */
    @Override
    public void onSaveInstanceState(Bundle currentState) {
        currentState.putIntegerArrayList(IMAGE_ID_LIST, (ArrayList<Integer>) mImageIds);
        currentState.putInt(LIST_INDEX, mListIndex);
    }


}