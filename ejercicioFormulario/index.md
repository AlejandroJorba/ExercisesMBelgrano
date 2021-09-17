<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formulario con Validaciones</title>
    <link href="https://unpkg.com/tailwindcss@^2/dist/tailwind.min.css" rel="stylesheet">
    <link rel="stylesheet" href="estilos.css">
</head>
<body>
    <div class="h-screen flex justify-center items-center bg-gray-800">
        <div class="gap-y-4 bg bg-black h-96 w-1/3 flex justify-center items-center flex-col border-4 border-blue-500">
            <p class="text-2xl text-blue-400">Contáctanos!</p>
            <form class="flex flex-col gap-y-4 mt-6">
                <input id="nombre" type="text" placeholder="Nombre" class="text-blue-400 placeholder-blue-400 bg-transparent outline-none border-blue-400 focus:border-blue-700 border-b-2">
                <input id="email" type="email" placeholder="Email" class="text-blue-400 placeholder-blue-400 bg-transparent outline-none border-blue-400 focus:border-blue-700 border-b-2">
                <input id="edad" type="text" placeholder="Edad" class="text-blue-400 placeholder-blue-400 bg-transparent outline-none border-blue-400 focus:border-blue-700 border-b-2">
                <input id="btn" type="submit" value="Enviar" class="border rounded-3xl cursor-pointer w-32 mx-auto my-2 bg-blue-400 border-blue-400 font-bold text-white hover:text-white hover:bg-blue-500 hover:border-blue-500">
            </form>
            <p id="resultado" class="">&nbsp;</p>
        </div>
    </div>
    <script src="scripts.js"></script>
</body>
</html>