# BridgeWars Plugin

A professional BridgeWars plugin for Zelvera MC.

## Features

- Team-based gameplay (2-4 teams)
- Bridge building mechanics
- Nexus destruction objectives
- Player statistics tracking
- Admin commands for management
- Configurable arenas

## Installation

1. Download the plugin JAR file
2. Place it in the server's `plugins` folder
3. Restart the server
4. Configure arenas using admin commands

## Commands

### Player Commands
- `/bw join <arena>` - Join an arena
- `/bw leave` - Leave the current game
- `/bw stats` - View your statistics
- `/bw shop` - Open the shop (coming soon)

### Admin Commands
- `/bwadmin start <arena>` - Force start an arena
- `/bwadmin stop <arena>` - Stop an arena
- `/bwadmin reload` - Reload arenas
- `/bwadmin create <arena>` - Create a new arena
- `/bwadmin list` - List all arenas

## Configuration

Arenas are stored in `plugins/BridgeWars/arenas/`

To create an arena:
1. Use `/bwadmin create <name>` while standing where you want the lobby
2. Edit the generated YAML file to set team spawns and nexus locations

## Building

This plugin uses Maven for building.

```bash
mvn clean package
```

The JAR will be in `target/BridgeWars-1.0.0.jar`

## Dependencies

- Spigot 1.8.8 or higher
- Java 8+

## Troubleshooting

- **Plugin not loading**: Check server logs for errors
- **Commands not working**: Ensure you have the correct permissions
- **Arena not found**: Use `/bwadmin list` to see available arenas

## License

This plugin is provided as-is. Feel free to modify and distribute.
