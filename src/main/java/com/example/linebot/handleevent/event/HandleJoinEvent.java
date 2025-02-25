package com.example.linebot.handleevent.event;

import com.linecorp.bot.model.event.Event;
import com.linecorp.bot.model.event.JoinEvent;

public class HandleJoinEvent extends AbstractHandleEvent {

    @Override
    public void handle(Event event) {
        System.out.println("参加イベント");
        String replyToken = ((JoinEvent) event).getReplyToken();
        this.replyText(replyToken, "こちらのbotではトークルームで使用できる便利な機能を提供しています。" + "\n" + "トークルームで[ヘルプ]と入力して頂くと操作説明を表示します。");
    }

}
