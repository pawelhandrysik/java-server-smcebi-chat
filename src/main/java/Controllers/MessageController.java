package Controllers;

import Models.Message;

public class MessageController {
    public static void NewMessage(String user_id, String channel_id, String send_time) {
//        DbConnection.BaseConnection();
        Message message = new Message();
//        message.set("data", data);
        message.set("user_id", user_id);
        message.set("channel_id", channel_id);
        message.set("date", channel_id);
        message.saveIt();
    }
}
