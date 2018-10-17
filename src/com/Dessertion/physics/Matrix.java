package com.Dessertion.physics;

import java.util.Arrays;

public class Matrix {
	private double[][] data;
	private int rows, columns;

	static class MatrixDimensionalException extends Exception {
		private static final long serialVersionUID = 1L;

		public MatrixDimensionalException() {
			super();
		}

		@Override
		public void printStackTrace() {
			System.err.println("Invalid matrix dimensions to perform this operation");
			super.printStackTrace();
		}
	}

	public Matrix(int row, int column) {
		this.data = new double[row][column];
		this.rows = row;
		this.columns = column;
	}

	public Matrix(int row, int column, int fill) {
		this(row, column);
		Arrays.fill(data, fill);
	}

	public Matrix(int sizeN) {
		this(sizeN, sizeN);
	}

	public Matrix identity(int sizeN) {
		Matrix ret = new Matrix(sizeN);
		for (int i = 0; i < sizeN; i++)
			ret.data[i][i] = 1;
		return ret;
	}

	public double get(int row, int column) {
		return data[row][column];
	}

	public void set(int row, int column, double d) {
		this.data[row][column] = d;
	}

	public double[][] getData() {
		return this.data;
	}

	public int rows() {
		return this.rows;
	}

	public int columns() {
		return this.columns;
	}

	public static Matrix add(Matrix m1, Matrix m2) {
		Matrix ret = m1;
		try {
			if (m1.rows != m2.rows || m1.columns != m2.columns) {
				throw new MatrixDimensionalException();
			} else {
				for (int i = 0; i < m1.rows(); i++) {
					for (int j = 0; j < m1.columns(); j++) {
						ret.data[i][j] = m1.get(i, j) + m2.get(i, j);
					}
				}
			}
		} catch (MatrixDimensionalException e) {
			e.printStackTrace();
		}
		return ret;
	}

	public void add(Matrix m) {
		Matrix sum = add(this, m);
		this.data = sum.data;
	}
	
	public static Matrix subtract(Matrix m1, Matrix m2) {
		Matrix ret = m1;
		try {
			if(m1.rows!=m2.rows||m1.columns!=m2.columns) {
				throw new MatrixDimensionalException();
			}
			else {
				for(int i = 0 ; i< m1.rows(); i++) {
					for(int j = 0 ; j < m1.columns; j++) {
						ret.data[i][j] = m1.get(i, j) - m2.get(i, j);
					}
				}
			}
		}
		catch(MatrixDimensionalException e) {
			e.printStackTrace();
		}
		return ret;
	}
	
	public void subtract(Matrix m) {
		Matrix diff = subtract(this,m);
		this.data = diff.data;
	}
	
	
}
