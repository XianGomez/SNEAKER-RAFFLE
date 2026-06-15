package edu.teamrocket.sneakerraffle.service;

import edu.teamrocket.sneakerraffle.model.Entry;
import edu.teamrocket.sneakerraffle.model.Raffle;

public class GUI {
    public static void drawSneaker(Raffle sneaker) {
        System.out.println(
        "\t\t" + " _    _" + "\n" +
        "\t\t" + "(_\\__/(,_" + "\n" +
        "\t\t" + "| \\ `_////-._" + "\n" +
        "\t\t" + "J_/___\"=> __/`\\" + "\n" +
        "\t\t" + "|=====;__/___./" + "\n" +
        "\t\t" + "\'-\'-\'-\"\"\"\"\"\"\"`" + "\n" +
        "\t\t" + sneaker.toString());
    }

    public static void drawEntry(Entry entry) {
        System.out.println(entry + "\n");
    }

    public static void drawWinner(Entry winner) {
        System.out.println("\n\t\t¡¡You are a Winner!!:" + winner + "\n");
    }

}
