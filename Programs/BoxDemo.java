class Box {
    double width;
    double height;
    double depth;
}

class BoxDemo {
    public static void main(String args[]){
      //cre
      Box mybox = new Box();
      double vol;

      mybox.width = 10.5;
      mybox.height = 11.5;
      mybox.depth = 12.5;

      vol = mybox.width*mybox.height*mybox.depth;
      System.out.println("Volume = " +vol);
      }
}
