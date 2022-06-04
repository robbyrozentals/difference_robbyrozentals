double size =40;
CSG cube = new Cube(	size,// X dimention
			size,// Y dimention
			size//  Z dimention
			).toCSG()
//create a sphere
CSG sphere = new Sphere(size/20*12.5).toCSG()
// perform a union

CSG simpleSyntax =new Cylinder(20,40).toCSG() // a one line Cylinder
sphere=sphere.difference(simpleSyntax)
CSG cubePlusSphere = cube.difference(sphere);
return [cubePlusSphere , cube.movex(size*1.5), sphere.movey(size*1.5)]