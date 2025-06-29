@echo off
setlocal

rem ✅ Pedimos el nombre del archivo Java sin extensión
set /p archivo=Introduce el nombre del archivo Java (sin .java): 

rem ✅ Compilamos
javac %archivo%.java

if exist %archivo%.class (
    rem ✅ Ejecutamos si compiló bien
    echo -------- EJECUTANDO %archivo%.class --------
    java %archivo%
    echo --------------------------------------------
) else (
    rem ⚠️ Si hubo errores de compilación
    echo ❌ No se encontró el archivo compilado. ¿Errores en el código?
)

pause
endlocal

