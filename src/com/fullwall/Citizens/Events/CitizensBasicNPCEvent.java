package com.fullwall.Citizens.Events;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;

import com.fullwall.resources.redecouverte.NPClib.HumanNPC;

public class CitizensBasicNPCEvent extends Event implements Cancellable {

	/**
	 * The serial ID of this event.
	 */
	private static final long serialVersionUID = -7050939396951324739L;

	/**
	 * Whether the event is cancelled or not.
	 */

	private boolean isCancelled = false;

	/**
	 * The text to be displayed by the NPC.
	 */

	private String text;

	/**
	 * The name of the NPC.
	 */

	private String name;

	/**
	 * The NPC object (requires redecouverte's NPC lib)
	 */

	private HumanNPC NPC;

	private Reason reason;

	private Location location;

	private Player player;

	public CitizensBasicNPCEvent(String name, String text, HumanNPC npc,
			Reason reason, Player player) {
		super("CitizensBasicNPCEvent");
		this.NPC = npc;
		this.location = npc.getBukkitEntity().getLocation();
		this.name = name;
		this.text = text;
		this.reason = reason;
		this.player = player;
	}

	/**
	 * Returns whether the event is cancelled or not.
	 * 
	 * @return isCancelled
	 */
	@Override
	public boolean isCancelled() {
		return isCancelled;
	}

	/**
	 * Cancels or uncancels the event.
	 * 
	 * @param isCancelled
	 */
	@Override
	public void setCancelled(boolean arg0) {
		isCancelled = arg0;
	}

	/**
	 * @return The text of the event.
	 */
	public String getText() {
		return this.text;
	}

	/**
	 * 
	 * @param text
	 *            The text you want displayed.
	 */
	public void setText(String text) {
		this.text = text;
		return;
	}

	/**
	 * 
	 * @return The name of the NPC.
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @return The HumanNPC object involved in the event.
	 */
	public HumanNPC getNPC() {
		return this.NPC;
	}

	/**
	 * 
	 * @param npc
	 *            The NPC Object you want to set the event to.
	 */
	public void setNPC(HumanNPC npc) {
		this.NPC = npc;
	}

	/**
	 * 
	 * @return The location of the event
	 */
	public Location getLocation() {
		return this.location;
	}

	/**
	 * 
	 * @return The player involved in the event
	 */
	public Player getPlayer() {
		return this.player;
	}

	public Reason getReason() {
		return this.reason;
	}

	public enum Reason {
		RIGHT_CLICK
	}

}
