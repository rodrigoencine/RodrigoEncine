package com.bdd.Jbebave;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import junit.framework.Assert;

public class MyLinkedListSteps {
  private int numOfNodes ;
  private String nodeVal;
  private MyLinkedList myLinkedList;
  
  @Given("$nnum nodes")
  public void numOfNodes(int num) {
    this.numOfNodes = num;
    myLinkedList = new MyLinkedList();
    System.out.println("Number of nodes going to add in List ===> "+ num);
  }
  @When("node value as $val")
  public void addNodeValues(String val) {
    System.out.println(">>>> adding the values in the list as -- "+ val);
    this.nodeVal = val;
  }
  @When("add them in the list")
  public void addThemInList() {
    System.out.println(">>>> Adding into the list...");
    myLinkedList.addNodeInLast(new Node(this.nodeVal, null));
  }
  @Then("get the size as $size")
  public void getTheListSize(int size) {
    System.out.println(">>>> Expected List size is - "+size);
    Assert.assertTrue(size == myLinkedList.getSize());
  }
}