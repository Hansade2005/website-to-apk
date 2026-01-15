# YouTube WebAPK Configuration

This configuration creates a native Android app wrapper for YouTube mobile web with enhanced features.

## Features

- Ad blocking userscripts
- Auto-skip ads
- Download buttons
- Remember playback speed
- Like/Dislike counter
- Remove "Open in App" prompts

## Usage

```bash
./make.sh build confs/youtube/webapk.conf
```

## Optional: Add Splash Screen

To add a splash screen, first create or download a splash image, then add to the config:

```ini
splashImage = youtube_splash.png
```

The splash screen will display while the YouTube page loads, providing a more professional app experience.
