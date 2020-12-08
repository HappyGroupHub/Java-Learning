package com.gmail.chiyc88.learning.group;

import java.util.Scanner;

public class FriendCounter {
    static void find_group(int n, boolean[] have_group, int[] friends) {
        int groups = 0;
        String[] group_members = new String[n];

        for (int i = 0; i < n; i++) {
            if (have_group[i]) {
                group_members[i] = new String();
                continue;
            }
            String member = "{" + i;
            have_group[i] = true;
            int next = friends[i];
            while (i != next) {
                member = member + ("," + next);
                have_group[next] = true;
                next = friends[next];
            }
            member += " }";
            group_members[i] = member;
            groups++;
        }

        System.out.println(groups);

        for (int i = 0; i < n; i++) {
            if (!group_members[i].isEmpty()) {
                System.out.println(group_members[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] friends = new int[n];
        boolean[] have_group = new boolean[n];
        for (int i = 0; i < n; i++) {
            have_group[i] = false;
            friends[i] = scanner.nextInt();
        }
        find_group(n,have_group,friends);
    }
}

//資數程設 - 好朋友圈子問題