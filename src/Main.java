import sdljava.SDLException;
import sdljava.SDLMain;
import sdljava.video.*;
public class Main
{
	static int Screen_Width = 640;
	static int Screen_Height = 480;
	static int Screen_Bpp = 32;
	
	static SDLSurface message = null;
	static SDLSurface background = null;
	static SDLSurface screen = null;
	public static void main(String[] args) 
	{
		SDLMain sdl = new SDLMain();	
		try {
			sdl.init(sdl.SDL_INIT_EVERYTHING);
			screen = SDLVideo.setVideoMode(Screen_Width, Screen_Height, Screen_Bpp, SDLVideo.SDL_SWSURFACE);
			if (screen == null)
			{

				return;
			}
			SDLVideo.wmSetCaption("WaterDrawer", null);
			message = SDLVideo.loadBMP("hello.bmp");
			background = SDLVideo.loadBMP("background.bmp");
			
			sdl.quit();
		} catch (SDLException e) {
			// TODO Auto-generated catch block
			System.err.println("SDL ≥ı ºªØ ß∞‹!");
			e.printStackTrace();
		}	
	}
}
