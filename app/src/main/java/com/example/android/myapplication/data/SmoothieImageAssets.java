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

package com.example.android.myapplication.data;

import com.example.android.myapplication.R;

import java.util.ArrayList;
import java.util.List;

// Class for storing all the image drawable resources in ArrayLists
public class SmoothieImageAssets {
    // Lists for all smoothie me and co images
    private static final List<Integer> titles = new ArrayList<Integer>() {{
        add(R.drawable.title1);
        add(R.drawable.title2);
        add(R.drawable.title3);
        add(R.drawable.title4);
        add(R.drawable.title5);
        add(R.drawable.title6);
        add(R.drawable.title7);
        add(R.drawable.title8);
        add(R.drawable.title9);
        add(R.drawable.title10);
        add(R.drawable.title11);
        add(R.drawable.title12);
        add(R.drawable.title13);
        add(R.drawable.title14);
        add(R.drawable.title15);
        add(R.drawable.title16);
        add(R.drawable.title17);
        add(R.drawable.title18);
        add(R.drawable.title19);
        add(R.drawable.title20);
        add(R.drawable.title21);
        add(R.drawable.title22);
        add(R.drawable.title23);
    }};

    private static final List<Integer> fruits = new ArrayList<Integer>() {{
        add(R.drawable.fruit1);
        add(R.drawable.fruit2);
        add(R.drawable.fruit3);
        add(R.drawable.fruit4);
        add(R.drawable.fruit5);
        add(R.drawable.fruit6);
        add(R.drawable.fruit7);
        add(R.drawable.fruit8);
        add(R.drawable.fruit9);
        add(R.drawable.fruit10);
        add(R.drawable.fruit11);
        add(R.drawable.fruit12);
        add(R.drawable.fruit13);
        add(R.drawable.fruit14);
        add(R.drawable.fruit15);
        add(R.drawable.fruit16);
        add(R.drawable.fruit17);
        add(R.drawable.fruit18);
        add(R.drawable.fruit19);
        add(R.drawable.fruit20);
        add(R.drawable.fruit21);
        add(R.drawable.fruit22);
        add(R.drawable.fruit23);
    }};

    private static final List<Integer> vegetables = new ArrayList<Integer>() {{
        add(R.drawable.vegetable1);
        add(R.drawable.vegetable2);
        add(R.drawable.vegetable3);
        add(R.drawable.vegetable4);
        add(R.drawable.vegetable5);
        add(R.drawable.vegetable6);
        add(R.drawable.vegetable7);
        add(R.drawable.vegetable8);
        add(R.drawable.vegetable9);
        add(R.drawable.vegetable10);
        add(R.drawable.vegetable11);
        add(R.drawable.vegetable12);
        add(R.drawable.vegetable13);
        add(R.drawable.vegetable14);
        add(R.drawable.vegetable15);
        add(R.drawable.vegetable16);
        add(R.drawable.vegetable17);
        add(R.drawable.vegetable18);
        add(R.drawable.vegetable19);
        add(R.drawable.vegetable20);
        add(R.drawable.vegetable21);
        add(R.drawable.vegetable22);
        add(R.drawable.vegetable23);
    }};

    private static final List<Integer> all = new ArrayList<Integer>() {{
        addAll(titles);
        addAll(fruits);
        addAll(vegetables);
    }};

    // Getter methods that return lists of all images.

    public static List<Integer> getTitles() {
        return titles;
    }

    public static List<Integer> getFruits() {
        return fruits;
    }

    public static List<Integer> getVegetables() {
        return vegetables;
    }

    // Returns a list of all the images combined.
    public static List<Integer> getAll() {
        return all;
    }
}
