class Main {
  public static void main(String[] args) {
    String znakchoinki = "^";
    for (int x=0; x<6; x++)
      {
      for (int y=0; y<x+6; y++)
        {
          if (y>(6-x)) {
            y++;
          System.out.print(znakchoinki);
          
        }
          else {
            System.out.print(" ");
      }
    }
  System.out.println();
  }
  }
}