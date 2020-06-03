package chapter13;

public class GenericMethodDemo {
  public static <T extends Comparable<T>, V extends T> boolean arrayEqual(T[] x, V[] v) {
    if (x.length != v.length) {
      return false;
    }

    for (int i = 0; i < x.length; i += 1) {
      if (!x[i].equals(v[i])) {
        return false;
      }
    }

    return true;
  }

  public static void main(String[] args) {
    Integer[] nums1 = {1, 2, 3, 4, 5};
    Integer[] nums2 = {1, 2, 3, 4, 5};
    Integer[] nums3 = {1, 2, 3, 4, 5};
    Integer[] nums4 = {1, 2, 3, 4, 5};
    Integer[] nums5 = {1, 2, 3, 4, 5, 6};

    if (GenericMethodDemo.arrayEqual(nums1, nums2)) {
      System.out.println("nums1 == nums2");
    }
    if (GenericMethodDemo.arrayEqual(nums2, nums3)) {
      System.out.println("nums2 == nums3");
    }
    if (GenericMethodDemo.arrayEqual(nums3, nums4)) {
      System.out.println("nums3 == nums4");
    }
    if (GenericMethodDemo.arrayEqual(nums4, nums5)) {
      System.out.println("nums1 == nums2");
    }
    
    // Double[] doubleNums = {1.1, 2.2, 3.3, 4.4, 5.5};
    // This won't compile because doubleNums are not of the same type as nums1
    // if (GenericMethodDemo.arrayEqual(doubleNums, nums3)) {
    //   System.out.println("nums3 == doubleNums");
    // }
  }
}