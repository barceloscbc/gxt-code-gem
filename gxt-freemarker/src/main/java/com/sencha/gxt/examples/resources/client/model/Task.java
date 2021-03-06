/**
 * Sencha GXT 4.0.1 - Sencha for GWT
 * Copyright (c) 2006-2016, Sencha Inc.
 *
 * licensing@sencha.com
 * http://www.sencha.com/products/gxt/license/
 *
 * ================================================================================
 * Evaluation/Trial License
 * ================================================================================
 * This version of Sencha GXT is licensed commercially for a limited period for
 * evaluation purposes only. Production use or use beyond the applicable evaluation
 * period is prohibited under this license.
 *
 * Please see the Sencha GXT Licensing page at:
 * http://www.sencha.com/products/gxt/license/
 *
 * For clarification or additional options, please contact:
 * licensing@sencha.com
 * ================================================================================
 *
 *
 *
 *
 *
 *
 *
 * ================================================================================
 * Disclaimer
 * ================================================================================
 * THIS SOFTWARE IS DISTRIBUTED "AS-IS" WITHOUT ANY WARRANTIES, CONDITIONS AND
 * REPRESENTATIONS WHETHER EXPRESS OR IMPLIED, INCLUDING WITHOUT LIMITATION THE
 * IMPLIED WARRANTIES AND CONDITIONS OF MERCHANTABILITY, MERCHANTABLE QUALITY,
 * FITNESS FOR A PARTICULAR PURPOSE, DURABILITY, NON-INFRINGEMENT, PERFORMANCE AND
 * THOSE ARISING BY STATUTE OR FROM CUSTOM OR USAGE OF TRADE OR COURSE OF DEALING.
 * ================================================================================
 */
package com.sencha.gxt.examples.resources.client.model;

public class Task {
  
  private int id;
  private String project;
  private int taskId;
  private String description;
  private double estimate;
  private double rate;
  private String due;// date?
  
  public Task(int id, String project, int taskId, String desc, double estimate, double rate, String due) {
    setId(id);
    setProject(project);
    setTaskId(taskId);
    setDescription(desc);
    setEstimate(estimate);
    setRate(rate);
    setDue(due);
  }

  public String getDescription() {
    return description;
  }

  public String getDue() {
    return due;
  }

  public double getEstimate() {
    return estimate;
  }

  public int getId() {
    return id;
  }

  public String getProject() {
    return project;
  }

  public double getRate() {
    return rate;
  }

  public int getTaskId() {
    return taskId;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setDue(String due) {
    this.due = due;
  }

  public void setEstimate(Double estimate) {
    if (estimate != null) {
      this.estimate = estimate;
    }
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setProject(String project) {
    this.project = project;
  }

  public void setRate(Double rate) {
    if (rate != null) {
      this.rate = rate;
    }
  }

  public void setTaskId(int taskId) {
    this.taskId = taskId;
  }
}
