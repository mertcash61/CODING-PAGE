import pyautogui
import webbrowser as wb
import time

wb.open("web.whatsapp.com")
time.sleep(30)

for i in range(1000):
    pyautogui.press("h")
    pyautogui.press("e")
    pyautogui.press("")
    pyautogui.press("h")
    pyautogui.press("e")