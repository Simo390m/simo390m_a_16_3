public class Exercise_3
{


    public static void main(String[] args)
    {
        LinkedIntList linkedIntList = new LinkedIntList();
        LinkedIntList notsortedLinkedIntList = new LinkedIntList();

        linkedIntList.add(1);
        linkedIntList.add(2);
        linkedIntList.add(3);
        linkedIntList.add(4);
        linkedIntList.add(5);
        linkedIntList.add(6);
        linkedIntList.add(7);

        notsortedLinkedIntList.add(1);
        notsortedLinkedIntList.add(3);
        notsortedLinkedIntList.add(2);


        System.out.println(isSorted(linkedIntList));
        System.out.println(isSorted(notsortedLinkedIntList));


    }


    public static boolean isSorted(LinkedIntList linkedIntList)
    {
        ListNode current = linkedIntList.getFront();
        int listSize = linkedIntList.size();
        boolean isSorted = true;

        for (int i = 0; i < listSize -1; i++)
        {
            if (current.next.data<current.data)
            {
                isSorted = false;

            }

            current = current.next;

        }

        return isSorted;
    }
}

