package org.msgpack.util.codegen;

import org.msgpack.MessagePacker;

public class DynamicOrdinalEnumPacker {
	public static MessagePacker create(Class<?> c) {
		try {
			DynamicCodeGen gen = DynamicCodeGen.getInstance();
			Class<?> packerClass = gen.generateOrdinalEnumPackerClass(c);
			return (MessagePacker) packerClass.newInstance();
		} catch (InstantiationException e) {
			throw new DynamicCodeGenException(e.getMessage(), e);
		} catch (IllegalAccessException e) {
			throw new DynamicCodeGenException(e.getMessage(), e);
		}
	}
}
