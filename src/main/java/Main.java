public class Main {

    public static void main(String[] args) throws Exception {

        /*int[] arr = {13,15,17,18,19,20,22};

        int n = 3 + arr.length;

        MissingNumber2 missingNumber = new MissingNumber2();
        missingNumber.missing_two(arr, n);*/

       /* LongestSubstring longestSubstring = new LongestSubstring();
       int max = longestSubstring.longestUniqueSubsttr("vishesh");
        System.out.println(max);*/

     /*   LongestPalindromeSubstring l = new LongestPalindromeSubstring();
        String str = l.longestPalindrome("babad");
        System.out.println(str);*/

       /* Node1 node1 = new Node1(1);
        node1.next = new Node1(2);
        node1.next.next = new Node1(3);
        node1.next.next.next = new Node1(4);
        node1.next.next.next.next = new Node1(5);
        node1.next.next.next.next.next = new Node1(6);
        node1.next.next.next.next.next.next = new Node1(7);
        node1.next.next.next.next.next.next.next = new Node1(8);

        RotateList1 rotateList = new RotateList1();
        Node1 head = rotateList.rotate(node1, 3);
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }*/

        /*LongestIncreasingSubsequence l = new LongestIncreasingSubsequence();
        int[] arr = {5,8,3,7,9,1};
        int a = 6;
        l.longestSubsequence(a, arr);*/

/*    int[] arr = {1,2,3};
    int[] arr1 = {20,30,40};
    Demo1 d = new Demo1();
    int b = d.small(arr, arr1);
        System.out.println(b);*/

       /* CombinationSum c = new CombinationSum();
        int[] arr = {2,3,6,7};
        int target = 7;
        List<List<Integer>> list = c.combination(arr, target);
        System.out.println(list);*/

       /*ArrayList<String> list = new ArrayList<>();
        list.add("vishesh");
        list.add("agarwal");*/

     /*   ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(12);

        Stream<Integer> a = list.stream().filter(s -> s % 2 != 0);
        a.forEach(s -> System.out.println(s*s));*/
        //foreach
        //list.stream().forEach(s -> System.out.print(s + " "));

        //map
        /*Stream<Character> l = (Stream<Character>) list.stream().map(n -> n.charAt(0)).collect(Collectors.toList());
        l.forEach(a -> System.out.println(a));*/
        //max
        //Integer a = list.stream().max(Integer::compare).get();
        //Optional<Integer> a = list.stream().max(Comparator.reverseOrder());

        //filter
        /*Stream<Integer> l =  list.stream().filter(s -> s > 15);
        l.forEach(a -> System.out.println(a));*/

        //SplitIterator
      /*  Spliterator<String> s = list.stream().spliterator();
        s.forEachRemaining(n -> System.out.println(n));*/

        //count
        /*long c = list.stream().count();
        System.out.println(c);*/

        //distinct
        /*Stream<String> l = list.stream().distinct();
        l.forEach(n -> System.out.println(n));*/

        // Creating a Stream of Strings
        /*Stream<String> stream = Stream.of("GFG", "Geeks",
                "for", "GeeksforGeeks");*/

        // Using forEachOrdered(Consumer action)
       /* stream.flatMap(str-> Stream.of(str.charAt(2)))
                .forEachOrdered(System.out::println);*/

        int[] arr = {1, 4, 7, 8, 10};
        int[] arr1 = {2, 3, 9};
        Merge_Arr merge_arr = new Merge_Arr();
        merge_arr.merge(arr,arr1);
        for (int a : arr) {
            System.out.print(a + " ");
        }
        for (int a : arr1) {
            System.out.print(a + " ");
        }
    }
}
