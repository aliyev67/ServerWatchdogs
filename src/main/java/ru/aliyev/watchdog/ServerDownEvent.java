package ru.aliyev.watchdog;

public class ServerDownEvent {
    private final String serverName;

    public ServerDownEvent(String serverName) {
        this.serverName = serverName;
    }

    public String getServerName() {
        return serverName;
    }
}
