package dev.rabbit.generated;

import java.math.BigInteger;
import java.util.Arrays;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 4.9.4.
 */
@SuppressWarnings("rawtypes")
public class FullMathTest extends Contract {
    public static final String BINARY = "608060405234801561001057600080fd5b506101e2806100206000396000f3fe608060405234801561001057600080fd5b50600436106100365760003560e01c80630af8b27f1461003b578063aa9a091214610076575b600080fd5b6100646004803603606081101561005157600080fd5b508035906020810135906040013561009f565b60408051918252519081900360200190f35b6100646004803603606081101561008c57600080fd5b50803590602081013590604001356100b6565b60006100ac8484846100c3565b90505b9392505050565b60006100ac8484846100fd565b60006100d08484846100fd565b9050600082806100dc57fe5b84860911156100af5760001981106100f357600080fd5b6001019392505050565b6000808060001985870986860292508281109083900303905080610133576000841161012857600080fd5b5082900490506100af565b80841161013f57600080fd5b6000848688096000868103871696879004966002600389028118808a02820302808a02820302808a02820302808a02820302808a02820302808a0290910302918190038190046001018684119095039490940291909403929092049190911791909102915050939250505056fea2646970667358221220fc87ca18190ca0d4733d7647424967d1b278bc2a6edbc05e7175e9382f08630c64736f6c63430007060033";

    public static final String FUNC_MULDIV = "mulDiv";

    public static final String FUNC_MULDIVROUNDINGUP = "mulDivRoundingUp";

    @Deprecated
    protected FullMathTest(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected FullMathTest(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected FullMathTest(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected FullMathTest(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<BigInteger> mulDiv(BigInteger x, BigInteger y, BigInteger z) {
        final Function function = new Function(FUNC_MULDIV, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(x), 
                new org.web3j.abi.datatypes.generated.Uint256(y), 
                new org.web3j.abi.datatypes.generated.Uint256(z)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<BigInteger> mulDivRoundingUp(BigInteger x, BigInteger y, BigInteger z) {
        final Function function = new Function(FUNC_MULDIVROUNDINGUP, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(x), 
                new org.web3j.abi.datatypes.generated.Uint256(y), 
                new org.web3j.abi.datatypes.generated.Uint256(z)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    @Deprecated
    public static FullMathTest load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new FullMathTest(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static FullMathTest load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new FullMathTest(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static FullMathTest load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new FullMathTest(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static FullMathTest load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new FullMathTest(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<FullMathTest> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(FullMathTest.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<FullMathTest> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(FullMathTest.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<FullMathTest> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(FullMathTest.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<FullMathTest> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(FullMathTest.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }
}
