package com.example.android.architecture.blueprints.todoapp.test;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.example.android.architecture.blueprints.todoapp.tasks.TasksActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class DummyTest {

    @Rule
    public ActivityTestRule<TasksActivity> rule = new ActivityTestRule<>(TasksActivity.class);

    @Test
    public void testCase() {

    }
}
