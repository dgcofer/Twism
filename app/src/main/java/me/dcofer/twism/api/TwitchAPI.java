package me.dcofer.twism.api;

import java.util.List;

import me.dcofer.twism.model.game.TwitchGame;
import me.dcofer.twism.model.stream.TwitchStream;
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by derek on 4/16/15.
 */
public interface TwitchAPI
{
    public static final String END_POINT = "https://api.twitch.tv/kraken";

    @GET("/games/top")
    void getGames( @Query("limit") int limit,
                   @Query("offset") int offset,
                   Callback<List<TwitchGame>> callback);

    @GET("/streams")
    void getStreams(@Query("game") String game,
                    @Query("limit") int limit,
                    @Query("offset") int offset,
                    Callback<List<TwitchStream>> callback);
}
