
	
	
		@Override
	    public void onEnable()
	    {
	    	Bukkit.getPluginManager().registerEvents(this, this);
	    	
	        this.getLogger().info("has started successfully!");
	    }
		public static void giveItemHelmet(Player p) {
			ItemStack item = new ItemStack(Material.LEATHER_HELMET);
			LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();
			meta.setDisplayName(ChatColor.GOLD + "Часть РЗК костюма #1");
			List<String> lore = new ArrayList<String>();
			lore.add(ChatColor.AQUA + "[Редкость]");
			lore.add(ChatColor.YELLOW + "ОБЫЧНАЯ");
			lore.add(ChatColor.AQUA + "[ОПИСАНИЕ]");
			lore.add(ChatColor.YELLOW + "Часть костюма от радиации");
			lore.add(ChatColor.YELLOW + "Требуется полный комплект из 4 частей");
			lore.add(ChatColor.AQUA + "[ЭФФЕКТЫ]");
			lore.add(ChatColor.YELLOW + "Защита от кислотного дождя");
			lore.add(ChatColor.YELLOW + "Защита от радиоактивной земли");
			lore.add(ChatColor.YELLOW + "Защита от радиоактивной воды");
			meta.setLore(lore);
			meta.setColor(Color.fromBGR(51, 133, 255));
			//meta.addEnchant(Enchantment.PROTECTION_FALL, 3, true);
			item.setItemMeta(meta);

			p.getInventory().addItem(item);
		}
		public static void giveItemChestplate(Player p) {
			ItemStack item = new ItemStack(Material.LEATHER_CHESTPLATE);
			LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();
			meta.setDisplayName(ChatColor.GOLD + "Часть РЗК костюма #2");
			List<String> lore = new ArrayList<String>();
			lore.add(ChatColor.AQUA + "[Редкость]");
			lore.add(ChatColor.YELLOW + "ОБЫЧНАЯ");
			lore.add(ChatColor.AQUA + "[ОПИСАНИЕ]");
			lore.add(ChatColor.YELLOW + "Часть костюма от радиации");
			lore.add(ChatColor.YELLOW + "Требуется полный комплект из 4 частей");
			lore.add(ChatColor.AQUA + "[ЭФФЕКТЫ]");
			lore.add(ChatColor.YELLOW + "Защита от кислотного дождя");
			lore.add(ChatColor.YELLOW + "Защита от радиоактивной земли");
			lore.add(ChatColor.YELLOW + "Защита от радиоактивной воды");
			meta.setLore(lore);
			meta.setColor(Color.fromBGR(51, 133, 255));
			//meta.addEnchant(Enchantment.PROTECTION_FALL, 3, true);
			item.setItemMeta(meta);

			p.getInventory().addItem(item);
		}
		public static void giveItemLeggings(Player p) {
			ItemStack item = new ItemStack(Material.LEATHER_LEGGINGS);
			LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();
			meta.setDisplayName(ChatColor.GOLD + "Часть РЗК костюма #3");
			List<String> lore = new ArrayList<String>();
			lore.add(ChatColor.AQUA + "[Редкость]");
			lore.add(ChatColor.YELLOW + "ОБЫЧНАЯ");
			lore.add(ChatColor.AQUA + "[ОПИСАНИЕ]");
			lore.add(ChatColor.YELLOW + "Часть костюма от радиации");
			lore.add(ChatColor.YELLOW + "Требуется полный комплект из 4 частей");
			lore.add(ChatColor.AQUA + "[ЭФФЕКТЫ]");
			lore.add(ChatColor.YELLOW + "Защита от кислотного дождя");
			lore.add(ChatColor.YELLOW + "Защита от радиоактивной земли");
			lore.add(ChatColor.YELLOW + "Защита от радиоактивной воды");
			meta.setLore(lore);
			meta.setColor(Color.fromBGR(51, 133, 255));
			//meta.addEnchant(Enchantment.PROTECTION_FALL, 3, true);
			item.setItemMeta(meta);

			p.getInventory().addItem(item);
		}
		public static void giveItemBoots(Player p) {
			ItemStack item = new ItemStack(Material.LEATHER_BOOTS);
			LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();
			meta.setDisplayName(ChatColor.GOLD + "Часть РЗК костюма #4");
			List<String> lore = new ArrayList<String>();
			lore.add(ChatColor.AQUA + "[Редкость]");
			lore.add(ChatColor.YELLOW + "ОБЫЧНАЯ");
			lore.add(ChatColor.AQUA + "[ОПИСАНИЕ]");
			lore.add(ChatColor.YELLOW + "Часть костюма от радиации");
			lore.add(ChatColor.YELLOW + "Требуется полный комплект из 4 частей");
			lore.add(ChatColor.AQUA + "[ЭФФЕКТЫ]");
			lore.add(ChatColor.YELLOW + "Защита от кислотного дождя");
			lore.add(ChatColor.YELLOW + "Защита от радиоактивной земли");
			lore.add(ChatColor.YELLOW + "Защита от радиоактивной воды");
			meta.setLore(lore);
			meta.setColor(Color.fromBGR(51, 133, 255));
			
			//meta.addEnchant(Enchantment.PROTECTION_FALL, 3, true);
			item.setItemMeta(meta);

			p.getInventory().addItem(item);
		}
		public boolean onCommand(final CommandSender sender, org.bukkit.command.Command cmd, String label, String[] args) {
			
			if (cmd.getName().equalsIgnoreCase("acidrain")) {
				if (!sender.hasPermission("acidrain.cmd")) return false;
				if (args[0].equalsIgnoreCase("give")) {
					Player p = Bukkit.getServer().getPlayer(args[1]);
					if (args[2].equalsIgnoreCase("helmet")) {
						this.giveItemHelmet(p);
					}
					if (args[2].equalsIgnoreCase("chestplate")) {
						this.giveItemChestplate(p);
					}
					if (args[2].equalsIgnoreCase("leggings")) {
						this.giveItemLeggings(p);
					}
					if (args[2].equalsIgnoreCase("boots")) {
						this.giveItemBoots(p);
					}
					if (args[2].equalsIgnoreCase("all")) {
						this.giveItemHelmet(p);
						this.giveItemChestplate(p);
						this.giveItemLeggings(p);
						this.giveItemBoots(p);
					}
				}
			}
			return false;
		}
	 	@EventHandler
	    public void Join(PlayerJoinEvent e) {
	    	Player p = e.getPlayer();
	    	Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(this, new Runnable() {
	        	
				@SuppressWarnings("deprecation")
				public void run() {
					/*
					 for(Player hrac:Bukkit.getOnlinePlayers()) {
						 if(hrac.getEquipment().getHelmet() != null) {
     	        			if(hrac.getEquipment().getChestplate() != null) {
     	        				if(hrac.getEquipment().getLeggings() != null) {
     	        					if(hrac.getEquipment().getBoots() != null) {
										 if(hrac.getEquipment().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #1")) {
				  	    					if(hrac.getEquipment().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #2")) {
				  	    						if(hrac.getEquipment().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #3")) {
				  	    							if(hrac.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
				  	    								hrac.playEffect(hrac.getLocation(), Effect.MOBSPAWNER_FLAMES, 0);
				  		    	        				return;
				  	    							}
				  	    						}
				  	    					}
										 }
     	        					}
     	        				}
     	        			}
						 }
					 }
					*/
	        		if(p.getLocation().getWorld().isThundering() == true) {
	        			int w = p.getLocation().getBlockY() + 2;
	        				if(p.getWorld().getHighestBlockYAt(p.getLocation()) < w) {
	        					if(p.hasPermission("acidrain.antirain")) {
	        						return;
	        					}
	        	        		if(p.getEquipment().getHelmet() == null) {
	        	        			if(p.getEquipment().getChestplate() == null) {
	        	        				if(p.getEquipment().getLeggings() == null) {
	        	        					if(p.getEquipment().getBoots() == null) {
	        	        						p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 200, 255));
	        	    	        				return;
	        	        					}
	        	        				}
	        	        			}
	        	        		}
	        	        		if(p.getEquipment().getHelmet() != null) {
	        	        			if(p.getEquipment().getChestplate() == null) {
	        	        				if(p.getEquipment().getLeggings() == null) {
	        	        					if(p.getEquipment().getBoots() == null) {
	        	        						if(p.getEquipment().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #1")) {
	        	        							p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 140, 100));
	        		    	        				return;
	        	        		        		} else {
	        	        		        			p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 180, 200));
	        		    	        				return;
	        	        		        		}
	        	        					}
	        	        				}
	        	        			}
	        	        		}
	        	        		if(p.getEquipment().getHelmet() == null) {
	        	        			if(p.getEquipment().getChestplate() != null) {
	        	        				if(p.getEquipment().getLeggings() == null) {
	        	        					if(p.getEquipment().getBoots() == null) {
	        	        						if(p.getEquipment().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #2")) {
	        	        							p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 140, 100));
	        		    	        				return;
	        	        		        		} else {
	        	        		        			p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 180, 200));
	        		    	        				return;
	        	        		        		}
	        	        					}
	        	        				}
	        	        			}
	        	        		}
	        	        		if(p.getEquipment().getHelmet() == null) {
	        	        			if(p.getEquipment().getChestplate() == null) {
	        	        				if(p.getEquipment().getLeggings() != null) {
	        	        					if(p.getEquipment().getBoots() == null) {
	        	        						if(p.getEquipment().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #3")) {
	        	        							p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 140, 100));
	        		    	        				return;
	        	        		        		} else {
	        	        		        			p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 180, 200));
	        		    	        				return;
	        	        		        		}
	        	        					}
	        	        				}
	        	        			}
	        	        		}
	        	        		if(p.getEquipment().getHelmet() == null) {
	        	        			if(p.getEquipment().getChestplate() == null) {
	        	        				if(p.getEquipment().getLeggings() == null) {
	        	        					if(p.getEquipment().getBoots() != null) {
	        	        						if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
	        	        							p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 140, 100));
	        		    	        				return;
	        	        		        		} else {
	        	        		        			p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 180, 200));
	        		    	        				return;
	        	        		        		}
	        	        					}
	        	        				}
	        	        			}
	        	        		}
	        	        		if(p.getEquipment().getHelmet() != null) {
	        	        			if(p.getEquipment().getChestplate() != null) {
	        	        				if(p.getEquipment().getLeggings() == null) {
	        	        					if(p.getEquipment().getBoots() == null) {
	        	        						if(p.getEquipment().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #1")) {
	        	        							if(p.getEquipment().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #2")) {
	        	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 100, 100));
	        			    	        				return;
	        	        		        			} else {
	        	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 180, 200));
	        			    	        				return;
	        	        		        			}
	        	        		        		} else {
	        	        		        			if(p.getEquipment().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #2")) {
	        	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 140, 100));
	        			    	        				return;
	        	        		        			} else {
	        	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 180, 200));
	        			    	        				return;
	        	        		        			}
	        	        		        		}
	        	        					}
	        	        				}
	        	        			}
	        	        		}	        		
	        	        		if(p.getEquipment().getHelmet() == null) {
	        	        			if(p.getEquipment().getChestplate() == null) {
	        	        				if(p.getEquipment().getLeggings() != null) {
	        	        					if(p.getEquipment().getBoots() != null) {
	        	        						if(p.getEquipment().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #3")) {
	        	        							if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
	        	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 100, 100));
	        			    	        				return;
	        	        		        			} else {
	        	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 180, 200));
	        			    	        				return;
	        	        		        			}
	        	        		        		} else {
	        	        		        			if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
	        	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 140, 100));
	        			    	        				return;
	        	        		        			} else {
	        	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 180, 200));
	        			    	        				return;
	        	        		        			}
	        	        		        		}
	        	        					}
	        	        				}
	        	        			}
	        	        		}
	        	        		if(p.getEquipment().getHelmet() != null) {
	        	        			if(p.getEquipment().getChestplate() != null) {
	        	        				if(p.getEquipment().getLeggings() != null) {
	        	        					if(p.getEquipment().getBoots() == null) {
	        	        						if(p.getEquipment().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #1")) {
	        	        							if(p.getEquipment().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #2")) {
	        	        								if(p.getEquipment().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #3")) {
	        	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 40, 100));
	        				    	        				return;
	        	        								} else {
	        	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 60, 100));
	        				    	        				return;
	        	        								}
	        	        		        			} else {
	        	        		        				if(p.getEquipment().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #3")) {
	        	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 40, 100));
	        				    	        				return;
	        	        								} else {
	        	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 60, 100));
	        				    	        				return;
	        	        								}
	        	        		        			}
	        	        		        		} else {
	        	        		        			if(p.getEquipment().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #2")) {
	        	        								if(p.getEquipment().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #3")) {
	        	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 40, 100));
	        				    	        				return;
	        	        								} else {
	        	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 60, 100));
	        				    	        				return;
	        	        								}
	        	        		        			} else {
	        	        		        				if(p.getEquipment().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #3")) {
	        	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 40, 100));
	        				    	        				return;
	        	        								} else {
	        	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 60, 100));
	        				    	        				return;
	        	        								}
	        	        		        			}
	        	        		        		}
	        	        					}
	        	        				}
	        	        			}
	        	        		}
	        	        		if(p.getEquipment().getHelmet() == null) {
	        	        			if(p.getEquipment().getChestplate() != null) {
	        	        				if(p.getEquipment().getLeggings() != null) {
	        	        					if(p.getEquipment().getBoots() != null) {
	        	        						if(p.getEquipment().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #2")) {
	        	        							if(p.getEquipment().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #3")) {
	        	        								if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
	        	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 40, 100));
	        				    	        				return;
	        	        								} else {
	        	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 60, 100));
	        				    	        				return;
	        	        								}
	        	        		        			} else {
	        	        		        				if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
	        	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 40, 100));
	        				    	        				return;
	        	        								} else {
	        	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 60, 100));
	        				    	        				return;
	        	        								}
	        	        		        			}
	        	        		        		} else {
	        	        		        			if(p.getEquipment().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #3")) {
	        	        								if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
	        	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 40, 100));
	        				    	        				return;
	        	        								} else {
	        	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 60, 100));
	        				    	        				return;
	        	        								}
	        	        		        			} else {
	        	        		        				if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
	        	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 40, 100));
	        				    	        				return;
	        	        								} else {
	        	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 60, 100));
	        				    	        				return;
	        	        								}
	        	        		        			}
	        	        		        		}
	        	        					}
	        	        				}
	        	        			}
	        	        		}
	        	        		if(p.getEquipment().getHelmet() != null) {
	        	        			if(p.getEquipment().getChestplate() == null) {
	        	        				if(p.getEquipment().getLeggings() != null) {
	        	        					if(p.getEquipment().getBoots() == null) {
	        	        						if(p.getEquipment().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #1")) {
	        	        							if(p.getEquipment().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #3")) {
	        	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 100, 100));
	        			    	        				return;
	        	        		        			} else {
	        	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 180, 200));
	        			    	        				return;
	        	        		        			}
	        	        		        		} else {
	        	        		        			if(p.getEquipment().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #3")) {
	        	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 140, 100));
	        			    	        				return;
	        	        		        			} else {
	        	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 180, 200));
	        			    	        				return;
	        	        		        			}
	        	        		        		}
	        	        					}
	        	        				}
	        	        			}
	        	        		}
	        	        		if(p.getEquipment().getHelmet() == null) {
	        	        			if(p.getEquipment().getChestplate() != null) {
	        	        				if(p.getEquipment().getLeggings() == null) {
	        	        					if(p.getEquipment().getBoots() != null) {
	        	        						if(p.getEquipment().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #2")) {
	        	        							if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
	        	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 100, 100));
	        			    	        				return;
	        	        		        			} else {
	        	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 180, 200));
	        			    	        				return;
	        	        		        			}
	        	        		        		} else {
	        	        		        			if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
	        	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 140, 100));
	        			    	        				return;
	        	        		        			} else {
	        	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 180, 200));
	        			    	        				return;
	        	        		        			}
	        	        		        		}
	        	        					}
	        	        				}
	        	        			}
	        	        		}
	        	        		if(p.getEquipment().getHelmet() != null) {
	        	        			if(p.getEquipment().getChestplate() == null) {
	        	        				if(p.getEquipment().getLeggings() != null) {
	        	        					if(p.getEquipment().getBoots() != null) {
	        	        						if(p.getEquipment().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #1")) {
	        	        							if(p.getEquipment().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #3")) {
	        	        								if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
	        	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 40, 100));
	        				    	        				return;
	        	        								} else {
	        	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 60, 100));
	        				    	        				return;
	        	        								}
	        	        		        			} else {
	        	        		        				if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
	        	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 40, 100));
	        				    	        				return;
	        	        								} else {
	        	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 60, 100));
	        				    	        				return;
	        	        								}
	        	        		        			}
	        	        		        		} else {
	        	        		        			if(p.getEquipment().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #3")) {
	        	        								if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
	        	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 40, 100));
	        				    	        				return;
	        	        								} else {
	        	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 60, 100));
	        				    	        				return;
	        	        								}
	        	        		        			} else {
	        	        		        				if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
	        	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 40, 100));
	        				    	        				return;
	        	        								} else {
	        	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 60, 100));
	        				    	        				return;
	        	        								}
	        	        		        			}
	        	        		        		}
	        	        					}
	        	        				}
	        	        			}
	        	        		}
	        	        		if(p.getEquipment().getHelmet() != null) {
	        	        			if(p.getEquipment().getChestplate() != null) {
	        	        				if(p.getEquipment().getLeggings() == null) {
	        	        					if(p.getEquipment().getBoots() != null) {
	        	        						if(p.getEquipment().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #1")) {
	        	        							if(p.getEquipment().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #2")) {
	        	        								if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
	        	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 40, 100));
	        				    	        				return;
	        	        								} else {
	        	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 60, 100));
	        				    	        				return;
	        	        								}
	        	        		        			} else {
	        	        		        				if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
	        	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 40, 100));
	        				    	        				return;
	        	        								} else {
	        	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 60, 100));
	        				    	        				return;
	        	        								}
	        	        		        			}
	        	        		        		} else {
	        	        		        			if(p.getEquipment().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #2")) {
	        	        								if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
	        	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 40, 100));
	        				    	        				return;
	        	        								} else {
	        	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 60, 100));
	        				    	        				return;
	        	        								}
	        	        		        			} else {
	        	        		        				if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
	        	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 40, 100));
	        				    	        				return;
	        	        								} else {
	        	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 60, 100));
	        				    	        				return;
	        	        								}
	        	        		        			}
	        	        		        		}
	        	        					}
	        	        				}
	        	        			}
	        	        		}
	        	        		if(p.getEquipment().getHelmet() != null) {
	        	        			if(p.getEquipment().getChestplate() == null) {
	        	        				if(p.getEquipment().getLeggings() == null) {
	        	        					if(p.getEquipment().getBoots() != null) {
	        	        						if(p.getEquipment().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #1")) {
	        	        							if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
	        	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 100, 100));
	        			    	        				return;
	        	        		        			} else {
	        	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 180, 200));
	        			    	        				return;
	        	        		        			}
	        	        		        		} else {
	        	        		        			if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
	        	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 140, 100));
	        			    	        				return;
	        	        		        			} else {
	        	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 180, 200));
	        			    	        				return;
	        	        		        			}
	        	        		        		}
	        	        					}
	        	        				}
	        	        			}
	        	        		}
	        	        		if(p.getEquipment().getHelmet() == null) {
	        	        			if(p.getEquipment().getChestplate() != null) {
	        	        				if(p.getEquipment().getLeggings() != null) {
	        	        					if(p.getEquipment().getBoots() == null) {
	        	        						if(p.getEquipment().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #2")) {
	        	        							if(p.getEquipment().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #3")) {
	        	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 100, 100));
	        			    	        				return;
	        	        		        			} else {
	        	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 180, 200));
	        			    	        				return;
	        	        		        			}
	        	        		        		} else {
	        	        		        			if(p.getEquipment().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #3")) {
	        	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 140, 100));
	        			    	        				return;
	        	        		        			} else {
	        	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 180, 200));
	        			    	        				return;
	        	        		        			}
	        	        		        		}
	        	        					}
	        	        				}
	        	        			}
	        	        		}
	        	        		if(p.getEquipment().getHelmet() != null) {
	        	        			if(p.getEquipment().getChestplate() != null) {
	        	        				if(p.getEquipment().getLeggings() != null) {
	        	        					if(p.getEquipment().getBoots() != null) {
	        	        						if(p.getEquipment().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #1")) {
	        	        	    					if(p.getEquipment().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #2")) {
	        	        	    						if(p.getEquipment().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #3")) {
	        	        	    							if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
	        	        		    	        				return;
	        	        	    							}
	        	        	    						} else {
	        	        	    							if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
	        	        	    								p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 20, 20));
	        	        		    	        				return;
	        	        	    							} else {
	        	        	    								p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 60, 60));
	        	        		    	        				return;
	        	        	    							}
	        	        	    						}
	        	        	    					} else {
	        	        	    						if(p.getEquipment().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #3")) {
	        	        	    							if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
	        	        	    								p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 20, 20));
	        	        		    	        				return;
	        	        	    							}
	        	        	    						} else {
	        	        	    							if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
	        	        	    								p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 40, 40));
	        	        		    	        				return;
	        	        	    							} else {
	        	        	    								p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 80, 80));
	        	        	    								return;
	        	        	    							}
	        	        	    						}
	        	        	    					}
	        	        		        		} else {
	        	        		        			if(p.getEquipment().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #2")) {
	        	        	    						if(p.getEquipment().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #3")) {
	        	        	    							if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
	        	        	    								p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 20, 20));
	        	        	    								return;
	        	        	    							}
	        	        	    						}
	        	        	    					} else {
	        	        	    						if(p.getEquipment().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #3")) {
	        	        	    							if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
	        	        	    								p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 40, 40));
	        	        	    								return;
	        	        	    							} else {
	        	        	    								p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 80, 80));
	        	        	    								return;
	        	        	    							}
	        	        	    						} else {
	        	        	    							if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
	        	        	    								p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 80, 80));
	        	        	    								return;
	        	        	    							} else {
	        	        	    								p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 100, 100));
	        	        	    								return;
	        	        	    							}
	        	        	    						}
	        	        	    					}
	        	        		        		}
	        	        					}
	        	        				}
	        	        			}
	        	        		}
	        			}
	        		}
	        		if(p.getLocation().getBlock().getType() == Material.WATER) {
	        			if(p.hasPermission("acidrain.antiwater")) {
	        				return;
	        			}
	        			if(p.getEquipment().getHelmet() == null) {
    	        			if(p.getEquipment().getChestplate() == null) {
    	        				if(p.getEquipment().getLeggings() == null) {
    	        					if(p.getEquipment().getBoots() == null) {
    	        						p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 200, 255));
    	    	        				return;
    	        					}
    	        				}
    	        			}
    	        		}
    	        		if(p.getEquipment().getHelmet() != null) {
    	        			if(p.getEquipment().getChestplate() == null) {
    	        				if(p.getEquipment().getLeggings() == null) {
    	        					if(p.getEquipment().getBoots() == null) {
    	        						if(p.getEquipment().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #1")) {
    	        							p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 140, 100));
    		    	        				return;
    	        		        		} else {
    	        		        			p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 180, 200));
    		    	        				return;
    	        		        		}
    	        					}
    	        				}
    	        			}
    	        		}
    	        		if(p.getEquipment().getHelmet() == null) {
    	        			if(p.getEquipment().getChestplate() != null) {
    	        				if(p.getEquipment().getLeggings() == null) {
    	        					if(p.getEquipment().getBoots() == null) {
    	        						if(p.getEquipment().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #2")) {
    	        							p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 140, 100));
    		    	        				return;
    	        		        		} else {
    	        		        			p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 180, 200));
    		    	        				return;
    	        		        		}
    	        					}
    	        				}
    	        			}
    	        		}
    	        		if(p.getEquipment().getHelmet() == null) {
    	        			if(p.getEquipment().getChestplate() == null) {
    	        				if(p.getEquipment().getLeggings() != null) {
    	        					if(p.getEquipment().getBoots() == null) {
    	        						if(p.getEquipment().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #3")) {
    	        							p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 140, 100));
    		    	        				return;
    	        		        		} else {
    	        		        			p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 180, 200));
    		    	        				return;
    	        		        		}
    	        					}
    	        				}
    	        			}
    	        		}
    	        		if(p.getEquipment().getHelmet() == null) {
    	        			if(p.getEquipment().getChestplate() == null) {
    	        				if(p.getEquipment().getLeggings() == null) {
    	        					if(p.getEquipment().getBoots() != null) {
    	        						if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
    	        							p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 140, 100));
    		    	        				return;
    	        		        		} else {
    	        		        			p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 180, 200));
    		    	        				return;
    	        		        		}
    	        					}
    	        				}
    	        			}
    	        		}
    	        		if(p.getEquipment().getHelmet() != null) {
    	        			if(p.getEquipment().getChestplate() != null) {
    	        				if(p.getEquipment().getLeggings() == null) {
    	        					if(p.getEquipment().getBoots() == null) {
    	        						if(p.getEquipment().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #1")) {
    	        							if(p.getEquipment().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #2")) {
    	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 100, 100));
    			    	        				return;
    	        		        			} else {
    	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 180, 200));
    			    	        				return;
    	        		        			}
    	        		        		} else {
    	        		        			if(p.getEquipment().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #2")) {
    	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 140, 100));
    			    	        				return;
    	        		        			} else {
    	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 180, 200));
    			    	        				return;
    	        		        			}
    	        		        		}
    	        					}
    	        				}
    	        			}
    	        		}	        		
    	        		if(p.getEquipment().getHelmet() == null) {
    	        			if(p.getEquipment().getChestplate() == null) {
    	        				if(p.getEquipment().getLeggings() != null) {
    	        					if(p.getEquipment().getBoots() != null) {
    	        						if(p.getEquipment().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #3")) {
    	        							if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
    	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 100, 100));
    			    	        				return;
    	        		        			} else {
    	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 180, 200));
    			    	        				return;
    	        		        			}
    	        		        		} else {
    	        		        			if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
    	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 140, 100));
    			    	        				return;
    	        		        			} else {
    	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 180, 200));
    			    	        				return;
    	        		        			}
    	        		        		}
    	        					}
    	        				}
    	        			}
    	        		}
    	        		if(p.getEquipment().getHelmet() != null) {
    	        			if(p.getEquipment().getChestplate() != null) {
    	        				if(p.getEquipment().getLeggings() != null) {
    	        					if(p.getEquipment().getBoots() == null) {
    	        						if(p.getEquipment().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #1")) {
    	        							if(p.getEquipment().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #2")) {
    	        								if(p.getEquipment().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #3")) {
    	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 40, 100));
    				    	        				return;
    	        								} else {
    	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 60, 100));
    				    	        				return;
    	        								}
    	        		        			} else {
    	        		        				if(p.getEquipment().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #3")) {
    	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 40, 100));
    				    	        				return;
    	        								} else {
    	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 60, 100));
    				    	        				return;
    	        								}
    	        		        			}
    	        		        		} else {
    	        		        			if(p.getEquipment().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #2")) {
    	        								if(p.getEquipment().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #3")) {
    	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 40, 100));
    				    	        				return;
    	        								} else {
    	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 60, 100));
    				    	        				return;
    	        								}
    	        		        			} else {
    	        		        				if(p.getEquipment().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #3")) {
    	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 40, 100));
    				    	        				return;
    	        								} else {
    	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 60, 100));
    				    	        				return;
    	        								}
    	        		        			}
    	        		        		}
    	        					}
    	        				}
    	        			}
    	        		}
    	        		if(p.getEquipment().getHelmet() == null) {
    	        			if(p.getEquipment().getChestplate() != null) {
    	        				if(p.getEquipment().getLeggings() != null) {
    	        					if(p.getEquipment().getBoots() != null) {
    	        						if(p.getEquipment().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #2")) {
    	        							if(p.getEquipment().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #3")) {
    	        								if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
    	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 40, 100));
    				    	        				return;
    	        								} else {
    	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 60, 100));
    				    	        				return;
    	        								}
    	        		        			} else {
    	        		        				if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
    	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 40, 100));
    				    	        				return;
    	        								} else {
    	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 60, 100));
    				    	        				return;
    	        								}
    	        		        			}
    	        		        		} else {
    	        		        			if(p.getEquipment().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #3")) {
    	        								if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
    	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 40, 100));
    				    	        				return;
    	        								} else {
    	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 60, 100));
    				    	        				return;
    	        								}
    	        		        			} else {
    	        		        				if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
    	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 40, 100));
    				    	        				return;
    	        								} else {
    	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 60, 100));
    				    	        				return;
    	        								}
    	        		        			}
    	        		        		}
    	        					}
    	        				}
    	        			}
    	        		}
    	        		if(p.getEquipment().getHelmet() != null) {
    	        			if(p.getEquipment().getChestplate() == null) {
    	        				if(p.getEquipment().getLeggings() != null) {
    	        					if(p.getEquipment().getBoots() == null) {
    	        						if(p.getEquipment().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #1")) {
    	        							if(p.getEquipment().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #3")) {
    	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 100, 100));
    			    	        				return;
    	        		        			} else {
    	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 180, 200));
    			    	        				return;
    	        		        			}
    	        		        		} else {
    	        		        			if(p.getEquipment().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #3")) {
    	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 140, 100));
    			    	        				return;
    	        		        			} else {
    	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 180, 200));
    			    	        				return;
    	        		        			}
    	        		        		}
    	        					}
    	        				}
    	        			}
    	        		}
    	        		if(p.getEquipment().getHelmet() == null) {
    	        			if(p.getEquipment().getChestplate() != null) {
    	        				if(p.getEquipment().getLeggings() == null) {
    	        					if(p.getEquipment().getBoots() != null) {
    	        						if(p.getEquipment().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #2")) {
    	        							if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
    	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 100, 100));
    			    	        				return;
    	        		        			} else {
    	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 180, 200));
    			    	        				return;
    	        		        			}
    	        		        		} else {
    	        		        			if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
    	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 140, 100));
    			    	        				return;
    	        		        			} else {
    	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 180, 200));
    			    	        				return;
    	        		        			}
    	        		        		}
    	        					}
    	        				}
    	        			}
    	        		}
    	        		if(p.getEquipment().getHelmet() != null) {
    	        			if(p.getEquipment().getChestplate() == null) {
    	        				if(p.getEquipment().getLeggings() != null) {
    	        					if(p.getEquipment().getBoots() != null) {
    	        						if(p.getEquipment().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #1")) {
    	        							if(p.getEquipment().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #3")) {
    	        								if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
    	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 40, 100));
    				    	        				return;
    	        								} else {
    	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 60, 100));
    				    	        				return;
    	        								}
    	        		        			} else {
    	        		        				if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
    	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 40, 100));
    				    	        				return;
    	        								} else {
    	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 60, 100));
    				    	        				return;
    	        								}
    	        		        			}
    	        		        		} else {
    	        		        			if(p.getEquipment().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #3")) {
    	        								if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
    	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 40, 100));
    				    	        				return;
    	        								} else {
    	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 60, 100));
    				    	        				return;
    	        								}
    	        		        			} else {
    	        		        				if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
    	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 40, 100));
    				    	        				return;
    	        								} else {
    	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 60, 100));
    				    	        				return;
    	        								}
    	        		        			}
    	        		        		}
    	        					}
    	        				}
    	        			}
    	        		}
    	        		if(p.getEquipment().getHelmet() != null) {
    	        			if(p.getEquipment().getChestplate() != null) {
    	        				if(p.getEquipment().getLeggings() == null) {
    	        					if(p.getEquipment().getBoots() != null) {
    	        						if(p.getEquipment().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #1")) {
    	        							if(p.getEquipment().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #2")) {
    	        								if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
    	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 40, 100));
    				    	        				return;
    	        								} else {
    	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 60, 100));
    				    	        				return;
    	        								}
    	        		        			} else {
    	        		        				if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
    	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 40, 100));
    				    	        				return;
    	        								} else {
    	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 60, 100));
    				    	        				return;
    	        								}
    	        		        			}
    	        		        		} else {
    	        		        			if(p.getEquipment().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #2")) {
    	        								if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
    	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 40, 100));
    				    	        				return;
    	        								} else {
    	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 60, 100));
    				    	        				return;
    	        								}
    	        		        			} else {
    	        		        				if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
    	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 40, 100));
    				    	        				return;
    	        								} else {
    	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 60, 100));
    				    	        				return;
    	        								}
    	        		        			}
    	        		        		}
    	        					}
    	        				}
    	        			}
    	        		}
    	        		if(p.getEquipment().getHelmet() != null) {
    	        			if(p.getEquipment().getChestplate() == null) {
    	        				if(p.getEquipment().getLeggings() == null) {
    	        					if(p.getEquipment().getBoots() != null) {
    	        						if(p.getEquipment().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #1")) {
    	        							if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
    	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 100, 100));
    			    	        				return;
    	        		        			} else {
    	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 180, 200));
    			    	        				return;
    	        		        			}
    	        		        		} else {
    	        		        			if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
    	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 140, 100));
    			    	        				return;
    	        		        			} else {
    	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 180, 200));
    			    	        				return;
    	        		        			}
    	        		        		}
    	        					}
    	        				}
    	        			}
    	        		}
    	        		if(p.getEquipment().getHelmet() == null) {
    	        			if(p.getEquipment().getChestplate() != null) {
    	        				if(p.getEquipment().getLeggings() != null) {
    	        					if(p.getEquipment().getBoots() == null) {
    	        						if(p.getEquipment().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #2")) {
    	        							if(p.getEquipment().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #3")) {
    	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 100, 100));
    			    	        				return;
    	        		        			} else {
    	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 180, 200));
    			    	        				return;
    	        		        			}
    	        		        		} else {
    	        		        			if(p.getEquipment().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #3")) {
    	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 140, 100));
    			    	        				return;
    	        		        			} else {
    	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 180, 200));
    			    	        				return;
    	        		        			}
    	        		        		}
    	        					}
    	        				}
    	        			}
    	        		}
    	        		if(p.getEquipment().getHelmet() != null) {
    	        			if(p.getEquipment().getChestplate() != null) {
    	        				if(p.getEquipment().getLeggings() != null) {
    	        					if(p.getEquipment().getBoots() != null) {
    	        						if(p.getEquipment().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #1")) {
    	        	    					if(p.getEquipment().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #2")) {
    	        	    						if(p.getEquipment().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #3")) {
    	        	    							if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
    	        		    	        				return;
    	        	    							}
    	        	    						} else {
    	        	    							if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
    	        	    								p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 20, 20));
    	        		    	        				return;
    	        	    							} else {
    	        	    								p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 60, 60));
    	        		    	        				return;
    	        	    							}
    	        	    						}
    	        	    					} else {
    	        	    						if(p.getEquipment().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #3")) {
    	        	    							if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
    	        	    								p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 20, 20));
    	        		    	        				return;
    	        	    							}
    	        	    						} else {
    	        	    							if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
    	        	    								p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 40, 40));
    	        		    	        				return;
    	        	    							} else {
    	        	    								p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 80, 80));
    	        	    								return;
    	        	    							}
    	        	    						}
    	        	    					}
    	        		        		} else {
    	        		        			if(p.getEquipment().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #2")) {
    	        	    						if(p.getEquipment().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #3")) {
    	        	    							if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
    	        	    								p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 20, 20));
    	        	    								return;
    	        	    							}
    	        	    						}
    	        	    					} else {
    	        	    						if(p.getEquipment().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #3")) {
    	        	    							if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
    	        	    								p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 40, 40));
    	        	    								return;
    	        	    							} else {
    	        	    								p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 80, 80));
    	        	    								return;
    	        	    							}
    	        	    						} else {
    	        	    							if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
    	        	    								p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 80, 80));
    	        	    								return;
    	        	    							} else {
    	        	    								p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 100, 100));
    	        	    								return;
    	        	    							}
    	        	    						}
    	        	    					}
    	        		        		}
    	        					}
    	        				}
    	        			}
    	        		}
	        		}
	        		if(p.getWorld().getBiome(p.getLocation().getBlockX(), p.getLocation().getBlockZ()) == Biome.SWAMP) {
	        			if(p.hasPermission("acidrain.antiswamp")) { 
	        				return;
	        			}
	        			if(p.getEquipment().getHelmet() == null) {
    	        			if(p.getEquipment().getChestplate() == null) {
    	        				if(p.getEquipment().getLeggings() == null) {
    	        					if(p.getEquipment().getBoots() == null) {
    	        						p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 200, 255));
    	    	        				return;
    	        					}
    	        				}
    	        			}
    	        		}
    	        		if(p.getEquipment().getHelmet() != null) {
    	        			if(p.getEquipment().getChestplate() == null) {
    	        				if(p.getEquipment().getLeggings() == null) {
    	        					if(p.getEquipment().getBoots() == null) {
    	        						if(p.getEquipment().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #1")) {
    	        							p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 140, 100));
    		    	        				return;
    	        		        		} else {
    	        		        			p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 180, 200));
    		    	        				return;
    	        		        		}
    	        					}
    	        				}
    	        			}
    	        		}
    	        		if(p.getEquipment().getHelmet() == null) {
    	        			if(p.getEquipment().getChestplate() != null) {
    	        				if(p.getEquipment().getLeggings() == null) {
    	        					if(p.getEquipment().getBoots() == null) {
    	        						if(p.getEquipment().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #2")) {
    	        							p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 140, 100));
    		    	        				return;
    	        		        		} else {
    	        		        			p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 180, 200));
    		    	        				return;
    	        		        		}
    	        					}
    	        				}
    	        			}
    	        		}
    	        		if(p.getEquipment().getHelmet() == null) {
    	        			if(p.getEquipment().getChestplate() == null) {
    	        				if(p.getEquipment().getLeggings() != null) {
    	        					if(p.getEquipment().getBoots() == null) {
    	        						if(p.getEquipment().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #3")) {
    	        							p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 140, 100));
    		    	        				return;
    	        		        		} else {
    	        		        			p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 180, 200));
    		    	        				return;
    	        		        		}
    	        					}
    	        				}
    	        			}
    	        		}
    	        		if(p.getEquipment().getHelmet() == null) {
    	        			if(p.getEquipment().getChestplate() == null) {
    	        				if(p.getEquipment().getLeggings() == null) {
    	        					if(p.getEquipment().getBoots() != null) {
    	        						if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
    	        							p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 140, 100));
    		    	        				return;
    	        		        		} else {
    	        		        			p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 180, 200));
    		    	        				return;
    	        		        		}
    	        					}
    	        				}
    	        			}
    	        		}
    	        		if(p.getEquipment().getHelmet() != null) {
    	        			if(p.getEquipment().getChestplate() != null) {
    	        				if(p.getEquipment().getLeggings() == null) {
    	        					if(p.getEquipment().getBoots() == null) {
    	        						if(p.getEquipment().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #1")) {
    	        							if(p.getEquipment().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #2")) {
    	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 100, 100));
    			    	        				return;
    	        		        			} else {
    	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 180, 200));
    			    	        				return;
    	        		        			}
    	        		        		} else {
    	        		        			if(p.getEquipment().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #2")) {
    	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 140, 100));
    			    	        				return;
    	        		        			} else {
    	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 180, 200));
    			    	        				return;
    	        		        			}
    	        		        		}
    	        					}
    	        				}
    	        			}
    	        		}	        		
    	        		if(p.getEquipment().getHelmet() == null) {
    	        			if(p.getEquipment().getChestplate() == null) {
    	        				if(p.getEquipment().getLeggings() != null) {
    	        					if(p.getEquipment().getBoots() != null) {
    	        						if(p.getEquipment().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #3")) {
    	        							if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
    	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 100, 100));
    			    	        				return;
    	        		        			} else {
    	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 180, 200));
    			    	        				return;
    	        		        			}
    	        		        		} else {
    	        		        			if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
    	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 140, 100));
    			    	        				return;
    	        		        			} else {
    	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 180, 200));
    			    	        				return;
    	        		        			}
    	        		        		}
    	        					}
    	        				}
    	        			}
    	        		}
    	        		if(p.getEquipment().getHelmet() != null) {
    	        			if(p.getEquipment().getChestplate() != null) {
    	        				if(p.getEquipment().getLeggings() != null) {
    	        					if(p.getEquipment().getBoots() == null) {
    	        						if(p.getEquipment().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #1")) {
    	        							if(p.getEquipment().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #2")) {
    	        								if(p.getEquipment().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #3")) {
    	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 40, 100));
    				    	        				return;
    	        								} else {
    	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 60, 100));
    				    	        				return;
    	        								}
    	        		        			} else {
    	        		        				if(p.getEquipment().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #3")) {
    	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 40, 100));
    				    	        				return;
    	        								} else {
    	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 60, 100));
    				    	        				return;
    	        								}
    	        		        			}
    	        		        		} else {
    	        		        			if(p.getEquipment().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #2")) {
    	        								if(p.getEquipment().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #3")) {
    	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 40, 100));
    				    	        				return;
    	        								} else {
    	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 60, 100));
    				    	        				return;
    	        								}
    	        		        			} else {
    	        		        				if(p.getEquipment().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #3")) {
    	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 40, 100));
    				    	        				return;
    	        								} else {
    	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 60, 100));
    				    	        				return;
    	        								}
    	        		        			}
    	        		        		}
    	        					}
    	        				}
    	        			}
    	        		}
    	        		if(p.getEquipment().getHelmet() == null) {
    	        			if(p.getEquipment().getChestplate() != null) {
    	        				if(p.getEquipment().getLeggings() != null) {
    	        					if(p.getEquipment().getBoots() != null) {
    	        						if(p.getEquipment().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #2")) {
    	        							if(p.getEquipment().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #3")) {
    	        								if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
    	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 40, 100));
    				    	        				return;
    	        								} else {
    	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 60, 100));
    				    	        				return;
    	        								}
    	        		        			} else {
    	        		        				if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
    	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 40, 100));
    				    	        				return;
    	        								} else {
    	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 60, 100));
    				    	        				return;
    	        								}
    	        		        			}
    	        		        		} else {
    	        		        			if(p.getEquipment().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #3")) {
    	        								if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
    	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 40, 100));
    				    	        				return;
    	        								} else {
    	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 60, 100));
    				    	        				return;
    	        								}
    	        		        			} else {
    	        		        				if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
    	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 40, 100));
    				    	        				return;
    	        								} else {
    	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 60, 100));
    				    	        				return;
    	        								}
    	        		        			}
    	        		        		}
    	        					}
    	        				}
    	        			}
    	        		}
    	        		if(p.getEquipment().getHelmet() != null) {
    	        			if(p.getEquipment().getChestplate() == null) {
    	        				if(p.getEquipment().getLeggings() != null) {
    	        					if(p.getEquipment().getBoots() == null) {
    	        						if(p.getEquipment().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #1")) {
    	        							if(p.getEquipment().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #3")) {
    	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 100, 100));
    			    	        				return;
    	        		        			} else {
    	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 180, 200));
    			    	        				return;
    	        		        			}
    	        		        		} else {
    	        		        			if(p.getEquipment().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #3")) {
    	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 140, 100));
    			    	        				return;
    	        		        			} else {
    	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 180, 200));
    			    	        				return;
    	        		        			}
    	        		        		}
    	        					}
    	        				}
    	        			}
    	        		}
    	        		if(p.getEquipment().getHelmet() == null) {
    	        			if(p.getEquipment().getChestplate() != null) {
    	        				if(p.getEquipment().getLeggings() == null) {
    	        					if(p.getEquipment().getBoots() != null) {
    	        						if(p.getEquipment().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #2")) {
    	        							if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
    	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 100, 100));
    			    	        				return;
    	        		        			} else {
    	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 180, 200));
    			    	        				return;
    	        		        			}
    	        		        		} else {
    	        		        			if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
    	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 140, 100));
    			    	        				return;
    	        		        			} else {
    	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 180, 200));
    			    	        				return;
    	        		        			}
    	        		        		}
    	        					}
    	        				}
    	        			}
    	        		}
    	        		if(p.getEquipment().getHelmet() != null) {
    	        			if(p.getEquipment().getChestplate() == null) {
    	        				if(p.getEquipment().getLeggings() != null) {
    	        					if(p.getEquipment().getBoots() != null) {
    	        						if(p.getEquipment().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #1")) {
    	        							if(p.getEquipment().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #3")) {
    	        								if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
    	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 40, 100));
    				    	        				return;
    	        								} else {
    	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 60, 100));
    				    	        				return;
    	        								}
    	        		        			} else {
    	        		        				if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
    	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 40, 100));
    				    	        				return;
    	        								} else {
    	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 60, 100));
    				    	        				return;
    	        								}
    	        		        			}
    	        		        		} else {
    	        		        			if(p.getEquipment().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #3")) {
    	        								if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
    	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 40, 100));
    				    	        				return;
    	        								} else {
    	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 60, 100));
    				    	        				return;
    	        								}
    	        		        			} else {
    	        		        				if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
    	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 40, 100));
    				    	        				return;
    	        								} else {
    	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 60, 100));
    				    	        				return;
    	        								}
    	        		        			}
    	        		        		}
    	        					}
    	        				}
    	        			}
    	        		}
    	        		if(p.getEquipment().getHelmet() != null) {
    	        			if(p.getEquipment().getChestplate() != null) {
    	        				if(p.getEquipment().getLeggings() == null) {
    	        					if(p.getEquipment().getBoots() != null) {
    	        						if(p.getEquipment().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #1")) {
    	        							if(p.getEquipment().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #2")) {
    	        								if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
    	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 40, 100));
    				    	        				return;
    	        								} else {
    	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 60, 100));
    				    	        				return;
    	        								}
    	        		        			} else {
    	        		        				if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
    	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 40, 100));
    				    	        				return;
    	        								} else {
    	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 60, 100));
    				    	        				return;
    	        								}
    	        		        			}
    	        		        		} else {
    	        		        			if(p.getEquipment().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #2")) {
    	        								if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
    	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 40, 100));
    				    	        				return;
    	        								} else {
    	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 60, 100));
    				    	        				return;
    	        								}
    	        		        			} else {
    	        		        				if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
    	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 40, 100));
    				    	        				return;
    	        								} else {
    	        									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 60, 100));
    				    	        				return;
    	        								}
    	        		        			}
    	        		        		}
    	        					}
    	        				}
    	        			}
    	        		}
    	        		if(p.getEquipment().getHelmet() != null) {
    	        			if(p.getEquipment().getChestplate() == null) {
    	        				if(p.getEquipment().getLeggings() == null) {
    	        					if(p.getEquipment().getBoots() != null) {
    	        						if(p.getEquipment().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #1")) {
    	        							if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
    	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 100, 100));
    			    	        				return;
    	        		        			} else {
    	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 180, 200));
    			    	        				return;
    	        		        			}
    	        		        		} else {
    	        		        			if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
    	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 140, 100));
    			    	        				return;
    	        		        			} else {
    	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 180, 200));
    			    	        				return;
    	        		        			}
    	        		        		}
    	        					}
    	        				}
    	        			}
    	        		}
    	        		if(p.getEquipment().getHelmet() == null) {
    	        			if(p.getEquipment().getChestplate() != null) {
    	        				if(p.getEquipment().getLeggings() != null) {
    	        					if(p.getEquipment().getBoots() == null) {
    	        						if(p.getEquipment().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #2")) {
    	        							if(p.getEquipment().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #3")) {
    	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 100, 100));
    			    	        				return;
    	        		        			} else {
    	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 180, 200));
    			    	        				return;
    	        		        			}
    	        		        		} else {
    	        		        			if(p.getEquipment().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #3")) {
    	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 140, 100));
    			    	        				return;
    	        		        			} else {
    	        		        				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 180, 200));
    			    	        				return;
    	        		        			}
    	        		        		}
    	        					}
    	        				}
    	        			}
    	        		}
    	        		if(p.getEquipment().getHelmet() != null) {
    	        			if(p.getEquipment().getChestplate() != null) {
    	        				if(p.getEquipment().getLeggings() != null) {
    	        					if(p.getEquipment().getBoots() != null) {
    	        						if(p.getEquipment().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #1")) {
    	        	    					if(p.getEquipment().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #2")) {
    	        	    						if(p.getEquipment().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #3")) {
    	        	    							if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
    	        		    	        				return;
    	        	    							}
    	        	    						} else {
    	        	    							if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
    	        	    								p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 20, 20));
    	        		    	        				return;
    	        	    							} else {
    	        	    								p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 60, 60));
    	        		    	        				return;
    	        	    							}
    	        	    						}
    	        	    					} else {
    	        	    						if(p.getEquipment().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #3")) {
    	        	    							if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
    	        	    								p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 20, 20));
    	        		    	        				return;
    	        	    							}
    	        	    						} else {
    	        	    							if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
    	        	    								p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 40, 40));
    	        		    	        				return;
    	        	    							} else {
    	        	    								p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 80, 80));
    	        	    								return;
    	        	    							}
    	        	    						}
    	        	    					}
    	        		        		} else {
    	        		        			if(p.getEquipment().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #2")) {
    	        	    						if(p.getEquipment().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #3")) {
    	        	    							if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
    	        	    								p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 20, 20));
    	        	    								return;
    	        	    							}
    	        	    						}
    	        	    					} else {
    	        	    						if(p.getEquipment().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #3")) {
    	        	    							if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
    	        	    								p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 40, 40));
    	        	    								return;
    	        	    							} else {
    	        	    								p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 80, 80));
    	        	    								return;
    	        	    							}
    	        	    						} else {
    	        	    							if(p.getEquipment().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Часть РЗК костюма #4")) {
    	        	    								p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 80, 80));
    	        	    								return;
    	        	    							} else {
    	        	    								p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 100, 100));
    	        	    								return;
    	        	    							}
    	        	    						}
    	        	    					}
    	        		        		}
    	        					}
    	        				}
    	        			}
    	        		}
	        		}
				}
	    }, 20, 20);
	 }
}
