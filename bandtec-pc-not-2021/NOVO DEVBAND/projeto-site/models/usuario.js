	'use strict';

/* 
lista e explicação dos Datatypes:
https://codewithhugo.com/sequelize-data-types-a-practical-guide/
*/

module.exports = (sequelize, DataTypes) => {
    let Usuario = sequelize.define('Usuario',{
		idUsuario: {
			field: 'idUsuario',
			type: DataTypes.INTEGER,
			primaryKey: true,
			autoIncrement: true
		},		
		nome_user: {
			field: 'nome_user',
			type: DataTypes.STRING,
			allowNull: false
		},
		email_user: {
			field: 'email_user',
			type: DataTypes.STRING,
			allowNull: false
		},
		senha_user: {
			field: 'senha_user',
			type: DataTypes.STRING,
			allowNull: false
		}
	}, 
	{
		tableName: 'usuario', 
		freezeTableName: true, 
		underscored: true,
		timestamps: false,
	});

    return Usuario;
};
