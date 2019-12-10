class BoxDemo2 {
  public static void main(String args[]){
      Box mybox1 = new Box();
      Box mybox2 = new Box();

      mybox1.width = 10.11;
      mybox1.height = 11.99;
      mybox1.depth = 99.00;

      double vol1;
      vol1 = mybox1.width * mybox1.height * mybox1.depth;

      double vol2;
      mybox2.width = 10.11;
      mybox2.height = 11.99;
      mybox2.depth = 99.00;

      vol2 = mybox2.width * mybox2.height * mybox2.depth;

      System.out.println("Volume 1 = " +vol1);
      System.out.println("Volume 2 = " +vol2);

      }
}
