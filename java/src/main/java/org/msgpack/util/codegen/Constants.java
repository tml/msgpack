package org.msgpack.util.codegen;

public interface Constants {
	String POSTFIX_TYPE_NAME_PACKER = "_$$_Packer";

	String POSTFIX_TYPE_NAME_UNPACKER = "_$$_Unpacker";

	String POSTFIX_TYPE_NAME_CONVERTER = "_$$_Converter";

	String POSTFIX_TYPE_NAME_TEMPLATE = "_$$_Template";

	String KEYWORD_MODIFIER_PUBLIC = "public";

	String KEYWORD_CATCH = "catch";

	String KEYWORD_ELSE = "else";

	String KEYWORD_ELSEIF = "else if";

	String KEYWORD_FOR = "for";

	String KEYWORD_IF = "if";

	String KEYWORD_INSTANCEOF = "instanceof";

	String KEYWORD_NEW = "new";

	String KEYWORD_NULL = "null";

	String KEYWORD_RETURN = "return";

	String KEYWORD_THROW = "throw";

	String KEYWORD_THROWS = "throws";

	String KEYWORD_TRY = "try";

	String CHAR_NAME_SPACE = " ";

	String CHAR_NAME_COMMA = ",";

	String CHAR_NAME_EQUAL = "=";

	String CHAR_NAME_PLUS = "+";

	String CHAR_NAME_MINUS = "-";

	String CHAR_NAME_UNDERSCORE = "_";

	String CHAR_NAME_LESSTHAN = "<";

	String CHAR_NAME_RIGHT_PARENTHESIS = ")";

	String CHAR_NAME_LEFT_PARENTHESIS = "(";

	String CHAR_NAME_RIGHT_CURLY_BRACKET = "}";

	String CHAR_NAME_LEFT_CURLY_BRACKET = "{";

	String CHAR_NAME_RIGHT_SQUARE_BRACKET = "]";

	String CHAR_NAME_LEFT_SQUARE_BRACKET = "[";

	String CHAR_NAME_DOT = ".";

	String CHAR_NAME_SEMICOLON = ";";

	String VARIABLE_NAME_PK = "_$$_pk";

	String VARIABLE_NAME_OBJECT = "_$$_obj";

	String VARIABLE_NAME_TARGET = "_$$_t";

	String VARIABLE_NAME_SIZE = "_$$_len";

	String VARIABLE_NAME_ARRAY = "_$$_ary";

	String VARIABLE_NAME_LIST = "_$$_list";

	String VARIABLE_NAME_MAP = "_$$_map";

	String VARIABLE_NAME_KEY = "_$$_key";

	String VARIABLE_NAME_VAL = "_$$_val";

	String VARIABLE_NAME_ITER = "_$$_iter";

	String VARIABLE_NAME_MPO = "_$$_mpo";

	String VARIABLE_NAME_I = "i";

	String VARIABLE_NAME_TEMPLATES = "_$$_templates";

	String VARIABLE_NAME_TEMPLATES0 = "_$$_tmpls";

	String VARIABLE_NAME_CLIENT = "_$$_client";

	String VARIABLE_NAME_CLIENT0 = "_$$_c";

	String METHOD_NAME_VALUEOF = "valueOf";

	String METHOD_NAME_BOOLEANVALUE = "booleanValue";

	String METHOD_NAME_BYTEVALUE = "byteValue";

	String METHOD_NAME_SHORTVALUE = "shortValue";

	String METHOD_NAME_INTVALUE = "intValue";

	String METHOD_NAME_FLOATVALUE = "floatValue";

	String METHOD_NAME_LONGVALUE = "longValue";

	String METHOD_NAME_DOUBLEVALUE = "doubleValue";

	String METHOD_NAME_ADD = "add";

	String METHOD_NAME_PUT = "put";

	String METHOD_NAME_GET = "get";

	String METHOD_NAME_SIZE = "size";

	String METHOD_NAME_KEYSET = "keySet";

	String METHOD_NAME_ITERATOR = "iterator";

	String METHOD_NAME_HASNEXT = "hasNext";

	String METHOD_NAME_NEXT = "next";

	String METHOD_NAME_ORDINAL = "ordinal";

	String METHOD_NAME_GETENUMCONSTANTS = "getEnumConstants";

	String METHOD_NAME_CONVERT = "convert";

	String METHOD_NAME_MSGCONVERT = "messageConvert";

	String METHOD_NAME_SETTEMPLATES = "setTemplates";

	String METHOD_NAME_SETCLIENT = "setClient";

	String METHOD_NAME_PACK = "pack";

	String METHOD_NAME_PACKARRAY = "packArray";

	String METHOD_NAME_UNPACK = "unpack";

	String METHOD_NAME_UNPACKBOOLEAN = "unpackBoolean";

	String METHOD_NAME_UNPACKBYTE = "unpackByte";

	String METHOD_NAME_UNPACKDOUBLE = "unpackDouble";

	String METHOD_NAME_UNPACKFLOAT = "unpackFloat";

	String METHOD_NAME_UNPACKINT = "unpackInt";

	String METHOD_NAME_UNPACKLONG = "unpackLong";

	String METHOD_NAME_UNPACKSHORT = "unpackShort";

	String METHOD_NAME_UNPACKSTRING = "unpackString";

	String METHOD_NAME_UNPACKBIGINTEGER = "unpackBigInteger";

	String METHOD_NAME_UNPACKOBJECT = "unpackObject";

	String METHOD_NAME_UNPACKBYTEARRAY = "unpackByteArray";

	String METHOD_NAME_UNPACKARRAY = "unpackArray";

	String METHOD_NAME_UNPACKMAP = "unpackMap";

	String METHOD_NAME_ASARRAY = "asArray";

	String METHOD_NAME_ASBOOLEAN = "asBoolean";

	String METHOD_NAME_ASBYTE = "asByte";

	String METHOD_NAME_ASSHORT = "asShort";

	String METHOD_NAME_ASINT = "asInt";

	String METHOD_NAME_ASFLOAT = "asFloat";

	String METHOD_NAME_ASLONG = "asLong";

	String METHOD_NAME_ASDOUBLE = "asDouble";

	String METHOD_NAME_ASSTRING = "asString";

	String METHOD_NAME_ASBYTEARRAY = "asByteArray";

	String METHOD_NAME_ASBIGINTEGER = "asBigInteger";

	String METHOD_NAME_ASLIST = "asList";

	String METHOD_NAME_ASMAP = "asMap";

	String STATEMENT_PACKER_PACKERMETHODBODY_01 = "%s _$$_t = (%s)$2; ";

	String STATEMENT_PACKER_PACKERMETHODBODY_02 = "$1.packArray(%d); ";

	String STATEMENT_PACKER_PACKERMETHODBODY_03 = "$1.pack(_$$_t.%s); ";

	String STATEMENT_PACKER_PACKERMETHODBODY_04 = "$1.pack(((java.lang.Enum)_$$_t).ordinal()); ";

	String STATEMENT_PACKER_PACKERMETHODBODY_05 = "if (_$$_nullCheck && $2 == null) { $1.packNil(); return; } ";

	String STATEMENT_TMPL_UNPACKERMETHODBODY_01 = "%s _$$_t = new %s(); ";

	String STATEMENT_TMPL_UNPACKERMETHODBODY_02 = "$1.unpackArray(); ";

	String STATEMENT_TMPL_UNPACKERMETHODBODY_03 = "if (!_$$_nullCheck || !$1.tryUnpackNull()) { _$$_t.%s = %s(%s)_$$_templates[%d].unpack($1)%s; } ";

	String STATEMENT_TMPL_UNPACKERMETHODBODY_04 = "return _$$_t; ";

	String STATEMENT_TMPL_UNPACKERMETHODBODY_05 = "int i = $1.unpackInt(); ";

	String STATEMENT_TMPL_UNPACKERMETHODBODY_06 = "return %s.class.getEnumConstants()[i]; ";

	String STATEMENT_TMPL_UNPACKERMETHODBODY_07 = "if (_$$_nullCheck && $1.tryUnpackNull()) { return null; } ";

	String STATEMENT_TMPL_CONVERTMETHODBODY_01 = "%s _$$_ary = $1.asArray(); ";

	String STATEMENT_TMPL_CONVERTMETHODBODY_02 = "if (!_$$_nullCheck || !_$$_ary[%d].isNil()) { _$$_t.%s = %s(%s)_$$_templates[%d].convert(_$$_ary[%d])%s; } ";

	String STATEMENT_TMPL_CONVERTMETHODBODY_03 = "int i = _$$_ary[0].asInt(); ";

	String STATEMENT_TMPL_CONVERTMETHODBODY_04 = "if (_$$_nullCheck && $1.isNil()) { return null; } ";
}
