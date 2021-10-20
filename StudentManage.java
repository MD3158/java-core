package Bài3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class StudentManage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Students> list1 = new ArrayList<>();
        int count = 0; int choiceNumber;
        String check, check1, check2 = " ";
        boolean test = true;


        for (; ;) {
            System.out.println("WELCOME TO STUDENT MANAGEMENT");
            System.out.println("1. Create");
            System.out.println("2. Find and Sort");
            System.out.println("3. Update/Delete");
            System.out.println("4. Report");
            System.out.println("5. Exit");


        do {
            System.out.println("Please choose 1 to Create, 2 to Find and Sort, 3 to Update/Delete, 4 to Report and 5 to Exit program");
            choiceNumber = Integer.parseInt(sc.nextLine());
            switch (choiceNumber) {
               case 1:
               //create
               do {
                    Students st = new Students();
                    System.out.println("Create");
                    System.out.print("ID: ");
                   do {
                       try {
                           st.setId(Integer.parseInt(sc.nextLine()));
                           break;
                       } catch(Exception e) {
                           System.out.println("Only number!");
                           System.out.print("ID: ");
                       }
                   } while (true);
                    System.out.print("Name: ");
                    st.student_name = sc.nextLine();
                    System.out.print("Semester: ");
                    st.semester = sc.nextLine();
                    System.out.print("Course Name: (Java, C/C++, .NET): ");
                    String course_name = sc.nextLine();
                    if (course_name.equalsIgnoreCase("java")
                           || course_name.equalsIgnoreCase("c/c++")
                           || course_name.equalsIgnoreCase(".net")) {
                       st.setCourse_name(course_name);
                    } else {
                        System.out.println("Please choose Java, C/C++,.NET");
                        continue;
                    }
                    list1.add(st);
                    count++;
                    if (count >= 4) {
                        System.out.println("Do you want to continue (Y/N)? Choose Y to continue, N to return main screen");
                        check = sc.nextLine();
                            if (check.equalsIgnoreCase("N")) {
                                test = false;
                            }
                        }
                    } while(test);
                    break;

               case 2:

                    System.out.println("Do you want to Find (F) or Short (S) student");
                    check2 = sc.nextLine();
                    if (check2.equalsIgnoreCase("S")) {
                        //Sort
                        System.out.println("Sort List: ");
                        Students st = new Students();
                        Collections.sort(list1, new Comparator<Students>() {
                             @Override
                             public int compare(Students o1, Students o2) {
                             return o1.getStudent_name().compareTo(o2.getStudent_name());}
                             });
                             for (int i = 0; i < list1.size(); i++) {
                             list1.get(i).output();
                             }
                        //find
                        } else if (check2.equalsIgnoreCase("F")) {
                        System.out.println("Find by name: ");
                        check1 = sc.nextLine();
                        for (int i = 0; i <= list1.size() - 1; i++) {
                             if (list1.get(i).getStudent_name().contains(check1))
                             {
                                 list1.get(i).output();
                             }
                             }
                        } else {
                                System.out.println("Please choose (S) to Sort, (F) to Find");
                                }
                        break;
                    case 3:
                        System.out.println("Do you want to Update (U) or Delete (D) student");
                        check2 = sc.nextLine();
                        //Update
                        if (check2.equalsIgnoreCase("U")) {
                            System.out.println("Find ID: ");
                            int check3 = Integer.parseInt(sc.nextLine());
                            for (int i = 0; i <= list1.size() - 1; i++) {
                                if (list1.get(i).getId() == check3) {
                                    list1.get(i).output();
                                    System.out.print("New student name: ");
                                    list1.get(i).setStudent_name(sc.nextLine());
                                    System.out.print("New student semester: ");
                                    list1.get(i).setSemester(sc.nextLine());
                                    System.out.print("New course name: ");
                                    list1.get(i).setCourse_name(sc.nextLine());
                                }
                            }
                        //Delete
                        }else if(check2.equalsIgnoreCase("D")){
                            System.out.println("Find ID: ");
                            int check3 = Integer.parseInt(sc.nextLine());
                            for (int i = 0; i <= list1.size() - 1; i++) {
                                if (list1.get(i).getId() == check3)
                                {
                                    System.out.println("Delete complete !");
                                    list1.remove(i);
                                }
                            }
                        }
                        else {
                            System.out.println("Please choose (U) to Update, (D) to Delete");
                             }
                        break;
                    case 4:
                        //Report
                        ArrayList<Students> arrTemp = new ArrayList<>();
                        for (int i=0;i<list1.size()-1;i++) {
                            for (int j=1;j<list1.size();j++) {
                                String a1 = list1.get(i).getStudent_name();
                                String a2 = list1.get(j).getStudent_name();
                                String b1 = list1.get(i).getCourse_name();
                                String b2 = list1.get(j).getCourse_name();
                                if ((a1.equals(a2)) && (b1.equals(b2))) {
                                    int c = 1;
                                    c++;
                                    list1.get(i).setCount1(c);
                                }
                            }
                        }
                        for (int i=0;i<list1.size()-1;i++) {
                            for (int j=1;i<list1.size()-1;i++) {
                                String a1 = list1.get(i).getStudent_name();
                                String a2 = list1.get(j).getStudent_name();
                                String b1 = list1.get(i).getCourse_name();
                                String b2 = list1.get(j).getCourse_name();
                                if ((a1.equals(a2)) && (b1.equals(b2))) {
                                    list1.remove(i);
                                }
                            }
                        }
//                         ArrayList<Students> arrTemp = new ArrayList<>();
//                         for (int i = 0; i < list1.size(); i++) {
//                            if ((!arrTemp.contains(list1.get(i).getStudent_name()))&&(!arrTemp.contains(list1.get(i).getCourse_name()))){
//                               arrTemp.add(list1.get(i));
//                            }
//                       }
//                        list1.clear();
//                        list1.addAll(arrTemp);

                        for (int i = 0; i<list1.size(); i++)
                        {
                            System.out.print("Name: " + list1.get(i).getStudent_name() + " | Course Name: " + list1.get(i).getCourse_name() + " | " + list1.get(i).getCount1() + "\n");
                        }

                    break;

                    default:
                        System.out.println("Please choose 1 to Create, 2 to Find and Sort, 3 to Update/Delete, 4 to Report and 5 to Exit program");
                        break;
                }
            } while ((choiceNumber < 1) || (choiceNumber > 4));
        }
    }
}